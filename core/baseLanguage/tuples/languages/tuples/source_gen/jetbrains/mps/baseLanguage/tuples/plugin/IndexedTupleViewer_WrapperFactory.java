package jetbrains.mps.baseLanguage.tuples.plugin;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapperFactory;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapper;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaValue;
import org.jetbrains.annotations.NotNull;
import com.sun.jdi.Value;
import jetbrains.mps.debug.evaluation.EvaluationUtils;
import jetbrains.mps.debug.evaluation.EvaluationException;
import jetbrains.mps.debug.evaluation.EvaluationRuntimeException;
import java.util.List;
import jetbrains.mps.debug.runtime.java.programState.watchables.CustomJavaWatchable;
import jetbrains.mps.debug.evaluation.proxies.IObjectValueProxy;
import java.util.ArrayList;
import jetbrains.mps.debug.evaluation.proxies.IArrayValueProxy;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaObjectValue;

public class IndexedTupleViewer_WrapperFactory extends ValueWrapperFactory {
  public IndexedTupleViewer_WrapperFactory() {
  }

  public ValueWrapper createValueWrapper(JavaValue value) {
    return new IndexedTupleViewer_WrapperFactory.IndexedTupleViewerWrapper(value);
  }

  @Override
  public boolean canWrapValue(@NotNull JavaValue javaValue) {
    try {
      Value value = javaValue.getValue();
      if (value == null) {
        return false;
      }
      if (!(EvaluationUtils.isInstanceOf(value.type(), "Ljetbrains/mps/baseLanguage/tuples/runtime/MultiTuple;", value.virtualMachine()))) {
        return false;
      }
      return true;
    } catch (EvaluationException e) {
      throw new EvaluationRuntimeException(e);
    }
  }

  public static class IndexedTupleViewerWrapper extends ValueWrapper {
    public IndexedTupleViewerWrapper(JavaValue value) {
      super(value);
    }

    protected List<CustomJavaWatchable> getSubvaluesImpl() {
      try {
        return getSubvaluesImpl((IObjectValueProxy) myValueProxy);
      } catch (EvaluationException e) {
        throw new EvaluationRuntimeException(e);
      }
    }

    protected List<CustomJavaWatchable> getSubvaluesImpl(IObjectValueProxy value) throws EvaluationException {
      List<CustomJavaWatchable> result = new ArrayList<CustomJavaWatchable>();
      IArrayValueProxy values = ((IArrayValueProxy) value.getFieldValue("values"));
      for (int i = 0; i < ((IArrayValueProxy) values).getLength(); i++) {
        result.add(new TuplesWatchables.MyWatchable_element(JavaObjectValue.fromJDIValue(((IObjectValueProxy) values.getElementAt(i)).getJDIValue(), getThreadReference()), "element"));
      }
      return result;
    }

    public String getValuePresentation() {
      try {
        return getValuePresentation((IObjectValueProxy) myValueProxy);
      } catch (EvaluationException e) {
        throw new EvaluationRuntimeException(e);
      }
    }

    protected String getValuePresentation(IObjectValueProxy value) throws EvaluationException {
      return "tuple " + (String) (((IObjectValueProxy) value.invokeMethod("toString", "()Ljava/lang/String;"))).invokeMethod("toString", "()Ljava/lang/String;").getJavaValue();
    }
  }
}
