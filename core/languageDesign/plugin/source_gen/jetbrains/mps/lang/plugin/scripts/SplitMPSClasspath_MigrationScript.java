package jetbrains.mps.lang.plugin.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelReference;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.project.structure.modules.Dependency;

public class SplitMPSClasspath_MigrationScript extends BaseMigrationScript {
  public SplitMPSClasspath_MigrationScript(IOperationContext operationContext) {
    super("Split MPS.Classpath stubs");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "MPS.Classpath -> MPS.Core / .Editor / .Workbench";
      }

      public String getAdditionalInfo() {
        return "MPS.Classpath -> MPS.Core / .Editor / .Workbench";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.core.structure.BaseConcept";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return ListSequence.fromList(SNodeOperations.getReferences(node)).where(new IWhereFilter<SReference>() {
          public boolean accept(SReference it) {
            return check_ylpn3n_a0a0a0a0a0a0(check_ylpn3n_a0a0a0a0a0a0a(SNodeOperations.getModel(SLinkOperations.getTargetNode(it)))) == MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("37a3367b-1fb2-44d8-aa6b-18075e74e003"));
          }
        }).isNotEmpty();
      }

      public void doUpdateInstanceNode(SNode node) {
        IModule[] modules = {MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("6ed54515-acc8-4d1e-a16c-9fd6cfe951ea")), MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("1ed103c3-3aa6-49b7-9c21-6765ee11f224")), MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("86441d7a-e194-42da-81a5-2161ec62a379"))};

        SModel model = SNodeOperations.getModel(node);
        IModule module = check_ylpn3n_a0d0a0(model.getModelDescriptor());

        for (SReference ref : ListSequence.fromList(SNodeOperations.getReferences(node))) {
          SModelReference oldModelRef = ref.getTargetSModelReference();
          final String fqname = check_ylpn3n_a0b0f0a0(oldModelRef);
          for (IModule newModule : modules) {
            List<SModelDescriptor> models = newModule.getOwnModelDescriptors();
            SModelReference modelRef = check_ylpn3n_a0b0c0f0a0(ListSequence.fromList(models).findFirst(new IWhereFilter<SModelDescriptor>() {
              public boolean accept(SModelDescriptor it) {
                return eq_e5sso0_a0a0a0a0a0a0b0c0f0e0a0a0b0a(it.getLongName(), fqname);
              }
            }));
            if (modelRef == null) {
              continue;
            }
            ref.setTargetSModelReference(modelRef);
            // check reference - sometimes same package can be in several modules 
            if ((SLinkOperations.getTargetNode(ref) == null)) {
              ref.setTargetSModelReference(oldModelRef);
              continue;
            }
            model.addModelImport(modelRef, false);
            model.deleteModelImport(oldModelRef);
            SModelRepository.getInstance().markChanged(model);
            // update module dependencies 
            if (module != null && module.getModuleDescriptor() != null) {
              List<Dependency> dependencies = module.getModuleDescriptor().getDependencies();
              Dependency dep = ListSequence.fromList(dependencies).findFirst(new IWhereFilter<Dependency>() {
                public boolean accept(Dependency it) {
                  return it.getModuleRef().equals(MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("37a3367b-1fb2-44d8-aa6b-18075e74e003")).getModuleReference());
                }
              });
              // get re-export from MPS.Classpath, then should be checked manually 
              module.addDependency(newModule.getModuleReference(), dep != null && dep.isReexport());
              ListSequence.fromList(dependencies).removeElement(dep);
              // <node> 
            }
            break;
          }
        }
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  private static IModule check_ylpn3n_a0a0a0a0a0a0(SModelDescriptor checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }

  private static SModelDescriptor check_ylpn3n_a0a0a0a0a0a0a(SModel checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModelDescriptor();
    }
    return null;
  }

  private static IModule check_ylpn3n_a0d0a0(SModelDescriptor checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getModule();
    }
    return null;
  }

  private static String check_ylpn3n_a0b0f0a0(SModelReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getLongName();
    }
    return null;
  }

  private static SModelReference check_ylpn3n_a0b0c0f0a0(SModelDescriptor checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getSModelReference();
    }
    return null;
  }

  private static boolean eq_e5sso0_a0a0a0a0a0a0b0c0f0e0a0a0b0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
