package jetbrains.mps.lang.smodel.plugin;

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
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaObjectValue;
import jetbrains.mps.debug.evaluation.proxies.IArrayValueProxy;
import jetbrains.mps.debug.evaluation.proxies.ProxyEqualsUtil;
import jetbrains.mps.debug.evaluation.proxies.MirrorUtil;

public class SNodeViewer_WrapperFactory extends ValueWrapperFactory {
  public SNodeViewer_WrapperFactory() {
  }

  public ValueWrapper createValueWrapper(JavaValue value) {
    return new SNodeViewer_WrapperFactory.SNodeViewerWrapper(value);
  }

  @Override
  public boolean canWrapValue(@NotNull JavaValue javaValue) {
    try {
      Value value = javaValue.getValue();
      if (value == null) {
        return false;
      }
      if (!(EvaluationUtils.isInstanceOf(value.type(), "Ljetbrains/mps/smodel/SNode;", value.virtualMachine()))) {
        return false;
      }
      return true;
    } catch (EvaluationException e) {
      throw new EvaluationRuntimeException(e);
    }
  }

  public static class SNodeViewerWrapper extends ValueWrapper {
    public SNodeViewerWrapper(JavaValue value) {
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

      result.add(new SNodeWatchables.MyWatchable_text(JavaObjectValue.fromJDIValue(((IObjectValueProxy) value.invokeMethod("toString", "()Ljava/lang/String;")).getJDIValue(), getThreadReference()), "text"));
      result.add(new SNodeWatchables.MyWatchable_id(JavaObjectValue.fromJDIValue(((IObjectValueProxy) value.getFieldValue("myId")).getJDIValue(), getThreadReference()), "id"));
      result.add(new SNodeWatchables.MyWatchable_model(JavaObjectValue.fromJDIValue(((IObjectValueProxy) value.getFieldValue("myModel")).getJDIValue(), getThreadReference()), "model"));
      result.add(new SNodeWatchables.MyWatchable_concept(JavaObjectValue.fromJDIValue(((IObjectValueProxy) EvaluationUtils.invokeStatic("jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations", "getConceptDeclaration", "(Ljetbrains/mps/smodel/SNode;)Ljetbrains/mps/smodel/SNode;", getThreadReference(), value)).getJDIValue(), getThreadReference()), "concept"));

      IArrayValueProxy properties = ((IArrayValueProxy) value.getFieldValue("myProperties"));
      if (!(ProxyEqualsUtil.javaEquals(properties, null))) {
        for (IObjectValueProxy property : EvaluationUtils.<IObjectValueProxy>toIterable(((IObjectValueProxy) ((IObjectValueProxy) value.invokeMethod("getProperties", "()Ljava/util/Map;")).invokeMethod("entrySet", "()Ljava/util/Set;")))) {
          result.add(new SNodeWatchables.MyWatchable_property(JavaObjectValue.fromJDIValue(property.getJDIValue(), getThreadReference()), "property"));
        }
      }

      for (IObjectValueProxy child : EvaluationUtils.<IObjectValueProxy>toIterable(((IObjectValueProxy) EvaluationUtils.invokeStatic("jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations", "getChildren", "(Ljetbrains/mps/smodel/SNode;)Ljava/util/List;", getThreadReference(), value)))) {
        result.add(new SNodeWatchables.MyWatchable_child(JavaObjectValue.fromJDIValue(child.getJDIValue(), getThreadReference()), "child"));
      }

      IArrayValueProxy references = ((IArrayValueProxy) value.getFieldValue("myReferences"));
      if (!(ProxyEqualsUtil.javaEquals(references, null))) {
        for (int i = 0; i < ((IArrayValueProxy) references).getLength(); i++) {
          result.add(new SNodeWatchables.MyWatchable_reference(JavaObjectValue.fromJDIValue(((IObjectValueProxy) references.getElementAt(i)).getJDIValue(), getThreadReference()), "reference"));
        }
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
      IObjectValueProxy containingRole = ((IObjectValueProxy) value.getFieldValue("myRoleInParent"));
      if (!(ProxyEqualsUtil.javaEquals(containingRole, null))) {
        containingRole = ((IObjectValueProxy) MirrorUtil.getValueProxyFromJavaValue(" in role: " + (String) (containingRole).getJavaValue(), getThreadReference()));
      } else {
        containingRole = ((IObjectValueProxy) MirrorUtil.getValueProxyFromJavaValue("", getThreadReference()));
      }
      return "node<" + (String) (((IObjectValueProxy) value.getFieldValue("myConceptFqName"))).getJavaValue() + ">" + (String) (containingRole).getJavaValue();
    }
  }
}
