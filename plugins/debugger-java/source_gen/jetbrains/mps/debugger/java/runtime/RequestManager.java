package jetbrains.mps.debugger.java.runtime;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.Map;
import jetbrains.mps.debugger.java.runtime.requests.Requestor;
import java.util.Set;
import com.sun.jdi.request.EventRequest;
import com.intellij.util.containers.HashMap;
import com.sun.jdi.request.EventRequestManager;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debugger.java.runtime.execution.DebuggerManagerThread;
import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import java.util.HashSet;
import com.sun.jdi.request.InvalidRequestStateException;
import com.sun.jdi.InternalException;
import com.sun.jdi.request.BreakpointRequest;
import jetbrains.mps.debugger.java.runtime.breakpoints.JavaBreakpoint;
import com.sun.jdi.Location;
import com.sun.jdi.request.MethodEntryRequest;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.request.MethodExitRequest;
import com.sun.jdi.request.AccessWatchpointRequest;
import com.sun.jdi.Field;
import com.sun.jdi.request.ModificationWatchpointRequest;
import com.sun.jdi.request.ExceptionRequest;
import java.util.List;
import com.sun.jdi.request.StepRequest;
import java.util.ArrayList;
import com.sun.jdi.ThreadReference;
import jetbrains.mps.debugger.java.runtime.requests.ClassPrepareRequestor;
import com.sun.jdi.request.ClassPrepareRequest;
import jetbrains.mps.debugger.java.runtime.execution.DebuggerCommand;
import jetbrains.mps.debug.api.BreakpointManagerComponent;
import jetbrains.mps.debug.api.breakpoints.IBreakpoint;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.ClassType;
import com.sun.jdi.InterfaceType;

public class RequestManager implements DebugProcessListener {
  private static final Logger LOG = Logger.getLogger(RequestManager.class);
  private static final Object REQUESTOR = new Object();
  private static final Object CLASS_NAME = new Object();

  private final Map<Requestor, Set<EventRequest>> myRequestorToBelongedRequests = new HashMap<Requestor, Set<EventRequest>>();
  private EventRequestManager myEventRequestManager;
  private DebugVMEventsProcessor myDebugEventsProcessor;
  private final Map<Requestor, String> myInvalidRequestsAndWarnings = new HashMap<Requestor, String>();

  public RequestManager(DebugVMEventsProcessor processor) {
    myDebugEventsProcessor = processor;
    myDebugEventsProcessor.addDebugProcessListener(this);
  }

  public EventRequestManager getVMRequestManager() {
    return myEventRequestManager;
  }

  @Nullable
  public Requestor findRequestor(EventRequest request) {
    DebuggerManagerThread.assertIsManagerThread();
    return (request != null ?
      (Requestor) request.getProperty(REQUESTOR) :
      null
    );
  }

  @NotNull
  public Set<EventRequest> findRequests(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();
    if (!(myRequestorToBelongedRequests.containsKey(requestor))) {
      return Collections.emptySet();
    }
    return new HashSet<EventRequest>(myRequestorToBelongedRequests.get(requestor));
  }

  private void registerRequestInternal(final Requestor requestor, final EventRequest request) {
    registerRequest(requestor, request);
    request.putProperty(REQUESTOR, requestor);
  }

  private void registerRequest(Requestor requestor, EventRequest request) {
    Set<EventRequest> reqSet = myRequestorToBelongedRequests.get(requestor);
    if (reqSet == null) {
      reqSet = new HashSet<EventRequest>();
      myRequestorToBelongedRequests.put(requestor, reqSet);
    }
    reqSet.add(request);
  }

  public void deleteRequests(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();
    if (!(myDebugEventsProcessor.isAttached())) {
      return;
    }
    final Set<EventRequest> requests = myRequestorToBelongedRequests.remove(requestor);
    if (requests == null) {
      return;
    }
    for (final EventRequest request : requests) {
      try {
        final Requestor targetRequestor = (Requestor) request.getProperty(REQUESTOR);
        if (targetRequestor != requestor) {
          //  the same request may be assigned to more than one requestor, but 
          //  there is only one 'targetRequestor' for each request, so if target requestor and requestor being processed are different, 
          //  should clear also the mapping targetRequestor->request 
          final Set<EventRequest> allTargetRequestorRequests = myRequestorToBelongedRequests.get(targetRequestor);
          if (allTargetRequestorRequests != null) {
            allTargetRequestorRequests.remove(request);
            if (allTargetRequestorRequests.size() == 0) {
              myRequestorToBelongedRequests.remove(targetRequestor);
            }
          }
        }
        myEventRequestManager.deleteEventRequest(request);
      } catch (InvalidRequestStateException ignored) {
        //  request is already deleted 
      } catch (InternalException e) {
        LOG.error(e);
      }
    }
  }

  public BreakpointRequest createBreakpointRequest(JavaBreakpoint requestor, Location location) {
    // ------------------- requests creation 
    DebuggerManagerThread.assertIsManagerThread();
    BreakpointRequest request = myEventRequestManager.createBreakpointRequest(location);
    initRequest(requestor, request);
    return request;
  }

  public MethodEntryRequest createMethodEntryRequest(JavaBreakpoint requestor, ReferenceType type) {
    DebuggerManagerThread.assertIsManagerThread();
    MethodEntryRequest request = myEventRequestManager.createMethodEntryRequest();
    request.addClassFilter(type);
    initRequest(requestor, request);
    return request;
  }

  public MethodExitRequest createMethodExitRequest(JavaBreakpoint requestor, ReferenceType type) {
    DebuggerManagerThread.assertIsManagerThread();
    MethodExitRequest request = myEventRequestManager.createMethodExitRequest();
    request.addClassFilter(type);
    initRequest(requestor, request);
    return request;
  }

  public AccessWatchpointRequest createFieldAccessRequest(JavaBreakpoint requestor, Field field) {
    DebuggerManagerThread.assertIsManagerThread();
    AccessWatchpointRequest request = myEventRequestManager.createAccessWatchpointRequest(field);
    initRequest(requestor, request);
    return request;
  }

  public ModificationWatchpointRequest createFieldModificationRequest(JavaBreakpoint requestor, Field field) {
    DebuggerManagerThread.assertIsManagerThread();
    ModificationWatchpointRequest request = myEventRequestManager.createModificationWatchpointRequest(field);
    initRequest(requestor, request);
    return request;
  }

  public ExceptionRequest createExceptionRequest(JavaBreakpoint requestor, ReferenceType reference) {
    DebuggerManagerThread.assertIsManagerThread();
    ExceptionRequest request = myEventRequestManager.createExceptionRequest(reference, true, true);
    initRequest(requestor, request);
    return request;
  }

  private void initRequest(JavaBreakpoint requestor, EventRequest req) {
    int suspendPolicy = requestor.getSuspendPolicy();
    if (suspendPolicy == EventRequest.SUSPEND_NONE) {
      suspendPolicy = EventRequest.SUSPEND_ALL;
    }
    //  we suspend all, do smth and then resume 
    req.setSuspendPolicy(suspendPolicy);
    registerRequestInternal(requestor, req);
  }

  /*package*/ void deleteStepRequests() {
    DebuggerManagerThread.assertIsManagerThread();
    // todo what are these step requests to delete? 
    List<StepRequest> stepRequests = myEventRequestManager.stepRequests();
    if (stepRequests.size() > 0) {
      List<StepRequest> toDelete = new ArrayList<StepRequest>(stepRequests.size());
      for (StepRequest request : stepRequests) {
        ThreadReference threadReference = request.thread();
        //  on attempt to delete a request assigned to a thread with unknown status, a JDWP error occures 
        if (threadReference.status() != ThreadReference.THREAD_STATUS_UNKNOWN) {
          toDelete.add(request);
        }
      }
      //  removing from requestor maps 
      for (StepRequest stepRequest : toDelete) {
        Requestor requestor = findRequestor(stepRequest);
        if (requestor != null) {
          Set<EventRequest> requestSet = myRequestorToBelongedRequests.get(requestor);
          requestSet.remove(stepRequest);
          if (requestSet.isEmpty()) {
            myRequestorToBelongedRequests.remove(requestor);
          }
        }
      }
      myEventRequestManager.deleteEventRequests(toDelete);
    }
  }

  public StepRequest createStepRequest(StepRequestor requestor, int stepType, ThreadReference stepThread, int suspendPolicy) {
    deleteStepRequests();
    StepRequest stepRequest = myEventRequestManager.createStepRequest(stepThread, StepRequest.STEP_LINE, stepType);
    stepRequest.setSuspendPolicy(suspendPolicy);
    registerRequestInternal(requestor, stepRequest);
    return stepRequest;
  }

  public void callbackOnPrepareClasses(ClassPrepareRequestor requestor, String classOrPatternToBeLoaded) {
    // todo: some other types of requests; later 
    // ------------------- ~requests creation 
    // by classname 
    DebuggerManagerThread.assertIsManagerThread();
    ClassPrepareRequest classPrepareRequest = createClassPrepareRequest(requestor, classOrPatternToBeLoaded);
    classPrepareRequest.enable();
  }

  private ClassPrepareRequest createClassPrepareRequest(ClassPrepareRequestor requestor, String className) {
    ClassPrepareRequest classPrepareRequest = myEventRequestManager.createClassPrepareRequest();
    classPrepareRequest.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
    classPrepareRequest.addClassFilter(className);
    classPrepareRequest.putProperty(CLASS_NAME, className);
    registerRequestInternal(requestor, classPrepareRequest);
    return classPrepareRequest;
  }

  public void enableRequest(EventRequest request) {
    // currently does no much more than request.enable() 
    DebuggerManagerThread.assertIsManagerThread();
    LOG.assertLog(findRequestor(request) != null);
    request.enable();
  }

  public void setInvalid(Requestor requestor, String message) {
    DebuggerManagerThread.assertIsManagerThread();
    myInvalidRequestsAndWarnings.put(requestor, message);
  }

  @Nullable
  public String getWarning(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();
    return myInvalidRequestsAndWarnings.get(requestor);
  }

  @Override
  public void connectorIsReady() {
    // todo impl 
  }

  @Override
  public void paused(@NotNull SuspendContext suspendContext) {
  }

  @Override
  public void resumed(@NotNull SuspendContext suspendContext) {
  }

  @Override
  public void processDetached(@NotNull DebugVMEventsProcessor process, boolean closedByUser) {
    myEventRequestManager = null;
    myRequestorToBelongedRequests.clear();
  }

  @Override
  public void processAttached(@NotNull DebugVMEventsProcessor process) {
    myEventRequestManager = myDebugEventsProcessor.getVirtualMachine().eventRequestManager();
    //  invoke later, so that requests are for sure created only _after_ 'processAttached()' methods of other listeneres are executed 
    process.getManagerThread().schedule(new DebuggerCommand() {
      @Override
      protected void action() throws Exception {
        BreakpointManagerComponent breakpointManager = myDebugEventsProcessor.getBreakpointManager();
        for (IBreakpoint breakpoint : breakpointManager.getAllIBreakpoints()) {
          if (breakpoint instanceof JavaBreakpoint) {
            ((JavaBreakpoint) breakpoint).createClassPrepareRequest(myDebugEventsProcessor);
          }
        }
      }
    });
  }

  public void processClassPrepared(final ClassPrepareEvent event) {
    if (!(myDebugEventsProcessor.isAttached())) {
      return;
    }
    final ReferenceType refType = event.referenceType();
    if (refType instanceof ClassType || refType instanceof InterfaceType) {
      ClassPrepareRequestor requestor = (ClassPrepareRequestor) event.request().getProperty(REQUESTOR);
      if (requestor != null) {
        requestor.processClassPrepare(myDebugEventsProcessor, refType);
      }
    }
  }

  public static void createClassPrepareRequests(final JavaBreakpoint breakpoint) {
    VMEventsProcessorManagerComponent.getInstance(breakpoint.getProject()).performAllDebugProcessesAction(new VMEventsProcessorManagerComponent.AllDebugProcessesAction() {
      @Override
      public void run(DebugVMEventsProcessor processor) {
        if (processor.isAttached()) {
          breakpoint.createClassPrepareRequest(processor);
        }
      }
    });
  }

  public static void removeClassPrepareRequests(final JavaBreakpoint breakpoint) {
    VMEventsProcessorManagerComponent.getInstance(breakpoint.getProject()).performAllDebugProcessesAction(new VMEventsProcessorManagerComponent.AllDebugProcessesAction() {
      @Override
      public void run(DebugVMEventsProcessor processor) {
        if (processor.isAttached()) {
          processor.getRequestManager().deleteRequests(breakpoint);
        }
      }
    });
  }
}
