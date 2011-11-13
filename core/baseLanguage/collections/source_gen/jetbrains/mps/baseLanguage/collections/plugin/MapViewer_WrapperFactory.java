package jetbrains.mps.baseLanguage.collections.plugin;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapperFactory;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapper;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaValue;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.evaluation.EvaluationUtils;
import jetbrains.mps.debug.evaluation.EvaluationException;
import com.sun.jdi.Value;
import java.util.List;
import jetbrains.mps.debug.runtime.java.programState.watchables.CustomJavaWatchable;
import jetbrains.mps.debug.evaluation.proxies.IObjectValueProxy;
import java.util.Collections;
import java.util.ArrayList;
import jetbrains.mps.debug.evaluation.proxies.PrimitiveValueProxy;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueUtil;

public class MapViewer_WrapperFactory extends ValueWrapperFactory {
  public MapViewer_WrapperFactory() {
  }

  public ValueWrapper createValueWrapper(JavaValue value) {
    return new MapViewer_WrapperFactory.MapViewerWrapper(value);
  }

  @Override
  public boolean canWrapValue(@NotNull final JavaValue javaValue) {
    return EvaluationUtils.consumeEvaluationException(new EvaluationUtils.EvaluationInvocatable<Boolean>() {
      public Boolean invoke() throws EvaluationException {
        Value value = javaValue.getValue();
        if (value == null) {
          return false;
        }
        if (!(EvaluationUtils.isInstanceOf(value.type(), "Ljava/util/Map;", value.virtualMachine()))) {
          return false;
        }
        return true;
      }
    }, false);
  }

  public static class MapViewerWrapper extends ValueWrapper {
    public MapViewerWrapper(JavaValue value) {
      super(value);
    }

    protected List<CustomJavaWatchable> getSubvaluesImpl() {
      return EvaluationUtils.consumeEvaluationException(new EvaluationUtils.EvaluationInvocatable<List<CustomJavaWatchable>>() {
        public List<CustomJavaWatchable> invoke() throws EvaluationException {
          return getSubvaluesImpl((IObjectValueProxy) myValueProxy);
        }
      }, Collections.<CustomJavaWatchable>emptyList());
    }

    protected List<CustomJavaWatchable> getSubvaluesImpl(IObjectValueProxy value) throws EvaluationException {
      List<CustomJavaWatchable> result = new ArrayList<CustomJavaWatchable>();

      PrimitiveValueProxy size = ((PrimitiveValueProxy) value.invokeMethod("size", "()I"));
      result.add(new CollectionsWatchables.MyWatchable_size(ValueUtil.getInstance().fromJDIValue(size.getJDIValue(), getThreadReference()), "size"));

      IObjectValueProxy entries = ((IObjectValueProxy) value.invokeMethod("entrySet", "()Ljava/util/Set;"));
      for (IObjectValueProxy entry : EvaluationUtils.getInstance().<IObjectValueProxy>toIterableProxy(entries)) {
        result.add(new CollectionsWatchables.MyWatchable_entry(ValueUtil.getInstance().fromJDIValue(entry.getJDIValue(), getThreadReference()), "entry"));
      }

      return result;
    }
  }
}
