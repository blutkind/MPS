package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JOptionPane;
import jetbrains.mps.smodel.ModelAccess;

public class AbstractConceptDeclaration_Behavior {
  private static Class[] PARAMETERS_1222430305282 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_findBehaviour_1213877394029(SNode thisNode, IScope scope) {
    Language language = SModelUtil.getDeclaringLanguage(thisNode, scope);
    if (language == null) {
      return null;
    }
    SModelDescriptor constraints = language.getBehaviorModelDescriptor();
    if (constraints == null) {
      return null;
    }
    SModel model = constraints.getSModel();
    for(SNode behaviour : SModelOperations.getRoots(model, "jetbrains.mps.lang.behavior.structure.ConceptBehavior")) {
      if (SLinkOperations.getTarget(behaviour, "concept", false) == thisNode) {
        return behaviour;
      }
    }
    return null;
  }

  public static SNode call_findConstraints_1213877394086(SNode thisNode, IScope scope) {
    Language language = SModelUtil.getDeclaringLanguage(thisNode, scope);
    if (language == null) {
      return null;
    }
    SModelDescriptor constraints = language.getConstraintsModelDescriptor();
    if (constraints == null) {
      return null;
    }
    SModel model = constraints.getSModel();
    for(SNode constraintsRoot : SModelOperations.getRoots(model, "jetbrains.mps.lang.constraints.structure.ConceptConstraints")) {
      if (SLinkOperations.getTarget(constraintsRoot, "concept", false) == thisNode) {
        return constraintsRoot;
      }
    }
    return null;
  }

  public static SNode call_findDataFlowBuilder_1213877394143(SNode thisNode, IScope scope) {
    Language language = SModelUtil.getDeclaringLanguage(thisNode, scope);
    if (language == null) {
      return null;
    }
    SModelDescriptor dataFlow = language.getDataFlowModelDescriptor();
    if (dataFlow == null) {
      return null;
    }
    SModel model = dataFlow.getSModel();
    for(SNode behaviour : SModelOperations.getRoots(model, "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration")) {
      if (SLinkOperations.getTarget(behaviour, "conceptDeclaration", false) == thisNode) {
        return behaviour;
      }
    }
    return null;
  }

  public static List<SNode> call_getAvailableConceptMethods_1213877394200(SNode thisNode, SNode context, IScope scope) {
    List<SNode> methods = new ArrayList<SNode>();
    if (thisNode == null) {
      return methods;
    }
    SNode contextBehaviour = SNodeOperations.getAncestor(context, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false);
    for(SNode concept : SConceptOperations.getConceptHierarchy(thisNode)) {
      SNode behaviour = AbstractConceptDeclaration_Behavior.call_findBehaviour_1213877394029(concept, scope);
      if (behaviour != null) {
        for(SNode method : SLinkOperations.getTargets(behaviour, "method", true)) {
          if (SLinkOperations.getTarget(method, "overriddenMethod", false) != null) {
            continue;
          }
          if (SLinkOperations.getTarget(method, "visibility", true) == null) {
            if (SNodeOperations.getModel(contextBehaviour) == SNodeOperations.getModel(method)) {
              ListSequence.fromList(methods).addElement(method);
            }
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
            if (SNodeOperations.getAncestor(method, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false) == contextBehaviour) {
              ListSequence.fromList(methods).addElement(method);
            }
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "visibility", true), "jetbrains.mps.baseLanguage.structure.PublicVisibility")) {
            ListSequence.fromList(methods).addElement(method);
          }
          if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "visibility", true), "jetbrains.mps.baseLanguage.structure.ProtectedVisibility")) {
            if (SConceptOperations.isSubConceptOf(SLinkOperations.getTarget(contextBehaviour, "concept", false), NameUtil.nodeFQName(SLinkOperations.getTarget(SNodeOperations.getAncestor(method, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", true, false), "concept", false)))) {
              ListSequence.fromList(methods).addElement(method);
            }
          }
        }
      }
    }
    return methods;
  }

  public static List<SNode> call_getVirtualConceptMethods_1213877394290(SNode thisNode, IScope scope) {
    List<SNode> methods = new ArrayList<SNode>();
    for(SNode concept : SConceptOperations.getAllSuperConcepts(thisNode, false)) {
      SNode behaviour = AbstractConceptDeclaration_Behavior.call_findBehaviour_1213877394029(concept, scope);
      if (behaviour != null) {
        for(SNode method : SLinkOperations.getTargets(behaviour, "method", true)) {
          if (SPropertyOperations.getBoolean(method, "isVirtual")) {
            ListSequence.fromList(methods).addElement(method);
          }
        }
      }
    }
    return methods;
  }

  public static List<SNode> call_getNotImplementedConceptMethods_1213877394339(SNode thisNode, IScope scope) {
    List<SNode> abstractMethods = new ArrayList<SNode>();
    List<SNode> implementedMethods = new ArrayList<SNode>();
    List<SNode> concepts = SConceptOperations.getAllSuperConcepts(thisNode, false);
    ListSequence.fromList(concepts).addElement(thisNode);
    for(SNode concept : concepts) {
      SNode behavior = AbstractConceptDeclaration_Behavior.call_findBehaviour_1213877394029(concept, scope);
      for(SNode method : SLinkOperations.getTargets(behavior, "method", true)) {
        if (SPropertyOperations.getBoolean(method, "isAbstract")) {
          ListSequence.fromList(abstractMethods).addElement(method);
        }
        if (SLinkOperations.getTarget(method, "overriddenMethod", false) != null) {
          ListSequence.fromList(implementedMethods).addElement(SLinkOperations.getTarget(method, "overriddenMethod", false));
        }
      }
    }
    ListSequence.fromList(abstractMethods).removeSequence(ListSequence.fromList(implementedMethods));
    return abstractMethods;
  }

  public static SNode call_getAdapterType_1213877394418(SNode thisNode) {
    if (thisNode == null) {
      return new _Quotations.QuotationClass_5().createNode();
    }
    String adapterClassFqName = NameUtil.nodeFQName(thisNode);
    SNode classifier = SNodeOperations.cast(SModelUtil.findNodeByFQName(adapterClassFqName, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"), GlobalScope.getInstance()), "jetbrains.mps.baseLanguage.structure.Classifier");
    SNode adapterClassType = SModelOperations.createNewNode(SNodeOperations.getModel(new _Quotations.QuotationClass_6().createNode()), "jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(adapterClassType, "classifier", classifier, false);
    return adapterClassType;
  }

  public static SNode call_findLinkDeclaration_1213877394467(SNode thisNode, String role) {
    return SNodeOperations.cast(BaseAdapter.fromAdapter(SModelSearchUtil.findLinkDeclaration(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)), role)), "jetbrains.mps.lang.structure.structure.LinkDeclaration");
  }

  public static List<SNode> call_getLinkDeclarations_1213877394480(SNode thisNode) {
    List<LinkDeclaration> links = SModelSearchUtil.getLinkDeclarations(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)));
    return (List<SNode>)BaseAdapter.toNodes(links);
  }

  public static List<SNode> call_getReferenceLinkDeclarations_1213877394496(SNode thisNode) {
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(thisNode);
    return ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "metaClass", "reference", "reference");
      }
    }).toListSequence();
  }

  public static List<SNode> call_getAggregationLinkDeclarations_1213877394521(SNode thisNode) {
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(thisNode);
    return ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "metaClass", "aggregation", "reference");
      }
    }).toListSequence();
  }

  public static List<SNode> call_getPropertyDeclarations_1213877394546(SNode thisNode) {
    List<PropertyDeclaration> properties = SModelSearchUtil.getPropertyDeclarations(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)));
    return (List<SNode>)BaseAdapter.toNodes(properties);
  }

  public static SNode call_findPropertyDeclaration_1219835742593(SNode thisNode, String name) {
    PropertyDeclaration p = SModelSearchUtil.findPropertyDeclaration(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)), name);
    return SNodeOperations.cast(BaseAdapter.fromAdapter(p), "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
  }

  public static List<SNode> call_getConceptPropertyDeclarations_1213877394562(SNode thisNode) {
    List<ConceptPropertyDeclaration> list = SModelSearchUtil.getConceptPropertyDeclarations(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)));
    return (List<SNode>)BaseAdapter.toNodes(list);
  }

  public static List<SNode> call_getConceptLinkDeclarations_1213877394578(SNode thisNode) {
    List<ConceptLinkDeclaration> list = SModelSearchUtil.getConceptLinkDeclarations(((AbstractConceptDeclaration)SNodeOperations.getAdapter(thisNode)));
    return (List<SNode>)BaseAdapter.toNodes(list);
  }

  public static boolean call_isDefaultSubstitutableConcept_1213877394594(SNode thisNode, SNode expectedConcept, IScope scope) {
    if (!(SConceptPropertyOperations.getBoolean(thisNode, "abstract")) && !(SConceptPropertyOperations.getBoolean(thisNode, "dontSubstituteByDefault"))) {
      return SConceptOperations.isSuperConceptOf(expectedConcept, NameUtil.nodeFQName(thisNode));
    }
    return false;
  }

  public static List<SNode> call_getImmediateSuperconcepts_1222430305282(SNode thisNode) {
    return (List<SNode>)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "virtual_getImmediateSuperconcepts_1222430305282", PARAMETERS_1222430305282);
  }

  public static List<SNode> callSuper_getImmediateSuperconcepts_1222430305282(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), callerConceptFqName, "virtual_getImmediateSuperconcepts_1222430305282", PARAMETERS_1222430305282);
  }

  public static void commitNameProperty_1232962485892(EditorContext editorContext, String oldValue, final SNode node, final String newValue) {
    if (oldValue != null) {
      int result = JOptionPane.showConfirmDialog(editorContext.getNodeEditorComponent(), "Renaming concept can break your model. It's advised to use rename refactoring instead. Are you sure?", "Rename concept", JOptionPane.YES_NO_OPTION);
      if (result == JOptionPane.NO_OPTION) {
        return;
      }
    }
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        SPropertyOperations.set(node, "name", newValue);
      }
    });
  }

}
