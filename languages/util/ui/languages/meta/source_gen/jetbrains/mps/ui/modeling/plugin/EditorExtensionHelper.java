package jetbrains.mps.ui.modeling.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public class EditorExtensionHelper {
  private static Iterable<SNode> EMPTY = Sequence.fromIterable(Collections.<SNode>emptyList());

  private IObjectsProvider<SNode, SNode> uiObjectTemplateProvider;
  private IObjectsProvider<SNode, SNode> eventHandlerProvider;
  private String templatesBase;

  public EditorExtensionHelper(String templatesBase) {
    this.templatesBase = templatesBase;
  }

  public void init() {
    SModelDescriptor wdesc = GlobalScope.getInstance().getModelDescriptor(SModelFqName.fromString(this.getWidgetTemplatesModel(this.templatesBase)));
    final SModel widgetsModel = (wdesc != null ?
      wdesc.getSModel() :
      null
    );
    this.uiObjectTemplateProvider = new IObjectsProvider<SNode, SNode>() {
      public Iterable<SNode> getObjects() {
        return (widgetsModel != null ?
          SModelOperations.getNodes(widgetsModel, "jetbrains.mps.ui.modeling.structure.UIObjectTemplate") :
          (Iterable<SNode>) EditorExtensionHelper.EMPTY
        );
      }

      public SNode create(final SNode context) {
        final Wrappers._T<SNode> tpl = new Wrappers._T<SNode>();
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            tpl.value = SModelOperations.createNewRootNode(widgetsModel, "jetbrains.mps.ui.modeling.structure.UIObjectTemplate", null);
            SLinkOperations.setTarget(tpl.value, "uiObject", context, false);
          }
        });
        return tpl.value;
      }

      public Object info() {
        return EditorExtensionHelper.this.templatesBase;
      }
    };
    SModelDescriptor edesc = GlobalScope.getInstance().getModelDescriptor(SModelFqName.fromString(this.getEventHandlerTemplatesModel(this.templatesBase)));
    final SModel eventsModel = (edesc != null ?
      edesc.getSModel() :
      null
    );
    this.eventHandlerProvider = new IObjectsProvider<SNode, SNode>() {
      public Iterable<SNode> getObjects() {
        return (eventsModel != null ?
          SModelOperations.getNodes(eventsModel, "jetbrains.mps.ui.modeling.structure.EventHandlerTemplate") :
          (Iterable<SNode>) EditorExtensionHelper.EMPTY
        );
      }

      public SNode create(final SNode context) {
        final Wrappers._T<SNode> eht = new Wrappers._T<SNode>();
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            eht.value = SModelOperations.createNewRootNode(eventsModel, "jetbrains.mps.ui.modeling.structure.EventHandlerTemplate", null);
            SLinkOperations.setTarget(eht.value, "event", context, false);
          }
        });
        return eht.value;
      }

      public Object info() {
        return EditorExtensionHelper.this.templatesBase;
      }
    };
    EditorExtensions.runDelayed(new _FunctionTypes._void_P1_E0<EditorExtensions>() {
      public void invoke(EditorExtensions ee) {
        ee.addUIObjectTemplateProvider(EditorExtensionHelper.this.uiObjectTemplateProvider);
        ee.addEventHandlerTemplateProvider(EditorExtensionHelper.this.eventHandlerProvider);
      }
    });
    EditorExtensions.runOnDispose(new _FunctionTypes._void_P1_E0<EditorExtensions>() {
      public void invoke(EditorExtensions ee) {
        ee.removeUIObjectTemplateProvider(EditorExtensionHelper.this.uiObjectTemplateProvider);
        ee.removeEventHandlerTemplateProvider(EditorExtensionHelper.this.eventHandlerProvider);
      }
    });
  }

  public void dispose() {
    this.uiObjectTemplateProvider = null;
    this.eventHandlerProvider = null;
  }

  public String getWidgetTemplatesModel(String base) {
    return base + ".widgets";
  }

  public String getEventHandlerTemplatesModel(String base) {
    return base + ".events";
  }
}
