package jetbrains.mps.kernel.model;

/*Generated by MPS */

import java.util.concurrent.ConcurrentMap;
import jetbrains.mps.smodel.SNode;
import java.util.concurrent.ConcurrentHashMap;
import jetbrains.mps.smodel.Language;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.util.InternUtil;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.NodeReadAccessCasterInEditor;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import java.util.ArrayList;
import jetbrains.mps.smodel.LanguageHierarchyCache;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class SModelUtil {
  private static ConcurrentMap<String, SNode> myFQNameToConcepDecl = new ConcurrentHashMap<String, SNode>();
  private static ConcurrentMap<SNode, Language> myConceptToLanguage = new ConcurrentHashMap<SNode, Language>();
  protected static Log log = LogFactory.getLog(SModelUtil.class);

  public static void clearCaches() {
    myFQNameToConcepDecl.clear();
    myConceptToLanguage.clear();
  }

  public static void conceptRenamed(String oldName, String newName) {
    SNode concept = myFQNameToConcepDecl.remove(oldName);
    if ((concept != null)) {
      myFQNameToConcepDecl.put(InternUtil.intern(newName), concept);
    }
  }

  public static SNode findNodeByFQName(String nodeFQName, SNode concept, IScope scope) {
    String modelName = NameUtil.namespaceFromLongName(nodeFQName);
    String name = NameUtil.shortNameFromLongName(nodeFQName);
    for (SModelDescriptor descriptor : Sequence.fromIterable(scope.getModelDescriptors())) {
      if (!(modelName.equals(descriptor.getLongName()))) {
        continue;
      }
      SModel model = descriptor.getSModel();
      for (SNode root : ListSequence.fromList(SModelOperations.getRoots(model, null))) {
        if (name.equals(root.getName()) && SNodeOperations.isInstanceOf(root, NameUtil.nodeFQName(concept))) {
          return root;
        }
      }
    }
    if (log.isWarnEnabled()) {
      log.warn("couldn't find node by fqname: " + nodeFQName);
    }
    return null;
  }

  public static SNode findConceptDeclaration(@NotNull final String conceptFQName, final IScope scope) {
    SNode cd = MapSequence.fromMap(myFQNameToConcepDecl).get(conceptFQName);
    if (cd != null) {
      return cd;
    }
    if (conceptFQName.equals("jetbrains.mps.smodel.structure.ModelPersistence$UnknownSNode")) {
      return null;
    }
    return NodeReadAccessCasterInEditor.runReadTransparentAction(new Computable<SNode>() {
      public SNode compute() {
        String languageFqName = NameUtil.namespaceFromConceptFQName(conceptFQName);
        Language language = MPSModuleRepository.getInstance().getLanguage(languageFqName);
        if (language == null) {
          return null;
        }
        String conceptName = NameUtil.shortNameFromLongName(conceptFQName);
        SNode result = (SNode) language.findConceptDeclaration(conceptName);
        if (result != null) {
          SModelUtil.myFQNameToConcepDecl.putIfAbsent(InternUtil.intern(conceptFQName), result);
        }
        return result;
      }
    });
  }

  public static SNode getConceptLinkTarget(SNode link) {
    if (SNodeOperations.isInstanceOf(link, "jetbrains.mps.lang.structure.structure.ReferenceConceptLink")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(link, "jetbrains.mps.lang.structure.structure.ReferenceConceptLink"), "target", false);
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(link, "jetbrains.mps.lang.structure.structure.AggregationConceptLink"), "target", true);
  }

  public static SNode getBaseConcept() {
    return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
  }

  public static Language getDeclaringLanguage(SNode concept) {
    if (concept == null) {
      return null;
    }
    Language l = MapSequence.fromMap(myConceptToLanguage).get(concept);
    if (l != null) {
      return l;
    }
    String languageFqName = NameUtil.namespaceFromConceptFQName(NameUtil.nodeFQName(concept));
    if (languageFqName == null) {
      return null;
    }
    l = MPSModuleRepository.getInstance().getLanguage(languageFqName);
    if (l != null) {
      myConceptToLanguage.putIfAbsent(concept, l);
    }
    return l;
  }

  public static SNode getGenuineLinkDeclaration(SNode linkDeclaration) {
    while (linkDeclaration != null && SLinkOperations.getTarget(linkDeclaration, "specializedLink", false) != null) {
      linkDeclaration = SLinkOperations.getTarget(linkDeclaration, "specializedLink", false);
    }
    return linkDeclaration;
  }

  public static String getGenuineLinkRole(SNode linkDecl) {
    SNode genLinkDecl = getGenuineLinkDeclaration(linkDecl);
    if (genLinkDecl == null) {
      return null;
    }
    return SPropertyOperations.getString(genLinkDecl, "role");
  }

  public static List<SNode> getDirectSuperInterfacesAndTheirSupers(SNode concept) {
    Set<SNode> result = SetSequence.fromSet(new LinkedHashSet<SNode>());
    for (SNode superConcept : ListSequence.fromList(getDirectSuperConcepts(concept))) {
      if (SNodeOperations.isInstanceOf(superConcept, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration") && !(SetSequence.fromSet(result).contains(superConcept))) {
        for (SNode node : ListSequence.fromList(new ConceptAndSuperConceptsScope(superConcept).getConcepts())) {
          SetSequence.fromSet(result).addElement((SNode) node);
        }
      }
    }
    return ListSequence.fromListWithValues(new ArrayList<SNode>(), result);
  }

  public static List<SNode> getDirectSuperConcepts(SNode concept) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    if (SNodeOperations.isInstanceOf(concept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
      SNode conceptDecl = (SNode) concept;
      SNode extended = SLinkOperations.getTarget(conceptDecl, "extends", false);
      if (extended != null) {
        ListSequence.fromList(result).addElement(extended);
      }
      for (SNode ref : ListSequence.fromList(SLinkOperations.getTargets(conceptDecl, "implements", true))) {
        if (SLinkOperations.getTarget(ref, "intfc", false) != null) {
          ListSequence.fromList(result).addElement(SLinkOperations.getTarget(ref, "intfc", false));
        }
      }
    } else {
      SNode intConceptDecl = (SNode) concept;
      for (SNode ref : ListSequence.fromList(SLinkOperations.getTargets(intConceptDecl, "extends", true))) {
        if (SLinkOperations.getTarget(ref, "intfc", false) != null) {
          ListSequence.fromList(result).addElement(SLinkOperations.getTarget(ref, "intfc", false));
        }
      }
    }
    return result;
  }

  public static boolean isAssignableConcept(SNode from, SNode to) {
    if (from == to) {
      return true;
    }
    if (from == null || to == null) {
      return false;
    }
    if (to == SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept")) {
      return true;
    }
    String fromFqName = NameUtil.nodeFQName(from);
    String toFqName = NameUtil.nodeFQName(to);
    return LanguageHierarchyCache.getInstance().isAssignable(fromFqName, toFqName);
  }

  public static boolean isAssignableConcept(String fromFqName, String toFqName) {
    if (eq_74see4_a0a0m(fromFqName, toFqName)) {
      return true;
    }
    if (fromFqName == null || toFqName == null) {
      return false;
    }
    if ("jetbrains.mps.lang.core.structure.BaseConcept".equals(toFqName)) {
      return true;
    }

    return LanguageHierarchyCache.getInstance().isAssignable(fromFqName, toFqName);
  }

  public static SNode getGenuineLinkSourceCardinality(SNode linkDecl) {
    return SEnumOperations.enumMemberForValue(SEnumOperations.getEnum("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "Cardinality"), SPropertyOperations.getString_def(getGenuineLinkDeclaration(linkDecl), "sourceCardinality", "0..1"));
  }

  public static SNode findAnnotationLinkDeclaration(final String childRole, IScope scope) {
    List<SNode> annotationLinks = SConceptOperations.findConceptInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration"), scope);
    if (childRole == null) {
      return null;
    }
    SNode annotationLinkDeclaration = ListSequence.fromList(annotationLinks).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode ald) {
        return SPropertyOperations.hasValue(ald, "stereotype", "node", "node") && childRole.equals(AttributesRolesUtil.childRoleFromAttributeRole(SPropertyOperations.getString(ald, "role")));
      }
    });
    return annotationLinkDeclaration;
  }

  public static boolean isAcceptableTarget(SNode linkDeclaration, SNode referentNode) {
    SNode linkTargetConcept = SLinkOperations.getTarget(linkDeclaration, "target", false);
    return isAssignableConcept(referentNode.getConceptFqName(), NameUtil.nodeFQName(linkTargetConcept));
  }

  public static boolean isMultipleLinkDeclaration(@NotNull SNode linkDeclaration) {
    return SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(linkDeclaration, "sourceCardinality", "1..n", "0..1");
  }

  public static boolean isAggregation(@NotNull SNode linkDeclaration) {
    return SPropertyOperations.hasValue(linkDeclaration, "metaClass", "aggregation", "reference");
  }

  public static SNode getLinkDeclarationTarget(SNode linkDeclaration) {
    return SLinkOperations.getTarget(linkDeclaration, "target", false);
  }

  public static SNode getLinkDeclarationSpecializedLink(SNode link) {
    return SLinkOperations.getTarget(link, "specializedLink", false);
  }

  public static String getLinkDeclarationRole(SNode link) {
    return SPropertyOperations.getString(link, "role");
  }

  private static boolean eq_74see4_a0a0m(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
