package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Classifier;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.VariableDeclaration;
import jetbrains.mps.baseLanguage.structure.FieldDeclaration;
import jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration;
import jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration;
import jetbrains.mps.baseLanguage.structure.EnumClass;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.structure.ConstructorDeclaration;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration;
import jetbrains.mps.smodel.search.IReferenceInfoResolver;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.BaseAdapter;

public class ClassifierAndSuperClassifiersScope extends AbstractClassifiersScope {
  private Classifier myTopClassifier;
  private int myOriginalConstraint;

  public ClassifierAndSuperClassifiersScope(@Nullable Classifier topClassifier) {
    this(topClassifier, IClassifiersSearchScope.ANYTHING);
  }

  public ClassifierAndSuperClassifiersScope(@Nullable Classifier topClassifier, int constraint) {
    super(constraint ^ (constraint & (IClassifiersSearchScope.INSTANCE_METHOD | IClassifiersSearchScope.STATIC_METHOD | IClassifiersSearchScope.CONSTRUCTOR | IClassifiersSearchScope.INSTANCE_FIELD | IClassifiersSearchScope.STATIC_FIELD)));
    this.myTopClassifier = topClassifier;
    this.myOriginalConstraint = constraint;
  }

  @NotNull
  public List<Classifier> getClassifiers() {
    if (this.myTopClassifier == null) {
      return new ArrayList<Classifier>();
    }
    return new ArrayList<Classifier>(ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getClassifiers());
  }

  @NotNull
  public List<BaseMethodDeclaration> getMethods() {
    if (this.myTopClassifier == null) {
      return new ArrayList<BaseMethodDeclaration>();
    }
    return new ArrayList<BaseMethodDeclaration>(ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getMethods());
  }

  @NotNull
  public List<BaseMethodDeclaration> getOverriddenMethods(BaseMethodDeclaration method) {
    if (this.myTopClassifier == null) {
      return new ArrayList<BaseMethodDeclaration>();
    }
    return new ArrayList<BaseMethodDeclaration>(ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getOverriddenMethods(method));
  }

  public List<BaseMethodDeclaration> getMethodsByName(String methodName) {
    if (this.myTopClassifier == null) {
      return new ArrayList<BaseMethodDeclaration>();
    }
    return new ArrayList<BaseMethodDeclaration>(ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getMethodsByName(methodName));
  }

  @NotNull
  public List<VariableDeclaration> getFields() {
    if (this.myTopClassifier == null) {
      return new ArrayList<VariableDeclaration>();
    }
    return new ArrayList<VariableDeclaration>(ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getFields());
  }

  public FieldDeclaration getFieldByName(String name) {
    if (this.myTopClassifier == null) {
      return null;
    }
    return ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getFieldByName(name);
  }

  public StaticFieldDeclaration getStaticFieldByName(String name) {
    if (this.myTopClassifier == null) {
      return null;
    }
    return ClassifierAndSuperClassifiersCache.getInstance(this.myTopClassifier).getStaticFieldByName(name);
  }

  public EnumConstantDeclaration getEnumConstantByName(String name) {
    if (this.myTopClassifier == null) {
      return null;
    }
    if (this.myTopClassifier instanceof EnumClass) {
      EnumClass enumClass = (EnumClass) this.myTopClassifier;
      for (EnumConstantDeclaration ec : enumClass.getEnumConstants()) {
        if (EqualUtil.equals(ec.getName(), name)) {
          return ec;
        }
      }
    }
    return null;
  }

  @NotNull
  public List<SNode> getNodes(Condition<SNode> condition) {
    List<SNode> list = super.getNodes(condition);
    if (this.myTopClassifier instanceof ClassConcept && (this.myOriginalConstraint & IClassifiersSearchScope.CONSTRUCTOR) == IClassifiersSearchScope.CONSTRUCTOR) {
      List<ConstructorDeclaration> constructors = ((ClassConcept) this.myTopClassifier).getConstructors();
      for (ConstructorDeclaration constructor : constructors) {
        if (condition.met(constructor.getNode())) {
          list.add(constructor.getNode());
        }
      }
    }
    if ((this.myOriginalConstraint & (IClassifiersSearchScope.INSTANCE_METHOD | IClassifiersSearchScope.STATIC_METHOD)) != 0) {
      List<BaseMethodDeclaration> methods = this.getMethods();
      for (BaseMethodDeclaration method : methods) {
        if (method instanceof InstanceMethodDeclaration) {
          if ((this.myOriginalConstraint & IClassifiersSearchScope.INSTANCE_METHOD) == IClassifiersSearchScope.INSTANCE_METHOD) {
            if (condition.met(method.getNode())) {
              list.add(method.getNode());
            }
          }
        } else
        if (method instanceof StaticMethodDeclaration) {
          if ((this.myOriginalConstraint & IClassifiersSearchScope.STATIC_METHOD) == IClassifiersSearchScope.STATIC_METHOD) {
            if (condition.met(method.getNode())) {
              list.add(method.getNode());
            }
          }
        }
      }
    }
    if ((this.myOriginalConstraint & (IClassifiersSearchScope.INSTANCE_FIELD | IClassifiersSearchScope.STATIC_FIELD)) != 0) {
      List<VariableDeclaration> fields = this.getFields();
      for (VariableDeclaration field : fields) {
        if (field instanceof FieldDeclaration) {
          if ((this.myOriginalConstraint & IClassifiersSearchScope.INSTANCE_FIELD) == IClassifiersSearchScope.INSTANCE_FIELD) {
            if (condition.met(field.getNode())) {
              list.add(field.getNode());
            }
          }
        } else
        if (field instanceof StaticFieldDeclaration) {
          if ((this.myOriginalConstraint & IClassifiersSearchScope.STATIC_FIELD) == IClassifiersSearchScope.STATIC_FIELD) {
            if (condition.met(field.getNode())) {
              list.add(field.getNode());
            }
          }
        }
      }
    }
    return list;
  }

  public IReferenceInfoResolver getReferenceInfoResolver(SNode referenceNode, AbstractConceptDeclaration targetConcept) {
    if (SModelUtil_new.isAssignableConcept(targetConcept, FieldDeclaration.concept)) {
      return new IReferenceInfoResolver() {
        public SNode resolve(String referenceInfo, SModelReference targetModelReference) {
          if (referenceInfo == null) {
            return null;
          }
          return BaseAdapter.fromAdapter(ClassifierAndSuperClassifiersScope.this.getFieldByName(referenceInfo));
        }
      };
    }
    if (SModelUtil_new.isAssignableConcept(targetConcept, StaticFieldDeclaration.concept)) {
      return new IReferenceInfoResolver() {
        public SNode resolve(String referenceInfo, SModelReference targetModelReference) {
          if (referenceInfo == null) {
            return null;
          }
          return BaseAdapter.fromAdapter(ClassifierAndSuperClassifiersScope.this.getStaticFieldByName(referenceInfo));
        }
      };
    }
    if (SModelUtil_new.isAssignableConcept(targetConcept, EnumConstantDeclaration.concept)) {
      return new IReferenceInfoResolver() {
        public SNode resolve(String referenceInfo, SModelReference targetModelReference) {
          if (referenceInfo == null) {
            return null;
          }
          return BaseAdapter.fromAdapter(ClassifierAndSuperClassifiersScope.this.getEnumConstantByName(referenceInfo));
        }
      };
    }
    return super.getReferenceInfoResolver(referenceNode, targetConcept);
  }
}
