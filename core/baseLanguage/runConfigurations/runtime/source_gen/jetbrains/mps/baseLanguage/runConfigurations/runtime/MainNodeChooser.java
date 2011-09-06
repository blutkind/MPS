package jetbrains.mps.baseLanguage.runConfigurations.runtime;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.List;
import jetbrains.mps.findUsages.FindUsagesManager;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class MainNodeChooser<C extends SNode> extends AbstractMainNodeChooser {
  @NotNull
  private C myTargetConcept;
  @Nullable
  private _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> myAcceptor;
  private final GlobalFilteredScope myScope;

  public MainNodeChooser() {
    this((C) SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"), null);
  }

  public MainNodeChooser(@NotNull final C targetConcept, @Nullable _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> acceptor) {
    super();

    myTargetConcept = targetConcept;
    myAcceptor = acceptor;

    final Wrappers._T<IModule> module = new Wrappers._T<IModule>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        module.value = SNodeOperations.getModel(targetConcept).getModelDescriptor().getModule();
      }
    });
    myScope = new GlobalFilteredScope() {
      @Nullable
      @Override
      protected Iterable<IModule> getRequiredModules() {
        return Sequence.<IModule>singleton(module.value);
      }
    };
  }

  public C getTargetConcept() {
    return myTargetConcept;
  }

  public void setTargetConcept(C targetConcept) {
    myTargetConcept = targetConcept;
  }

  public _FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> getAcceptor() {
    return myAcceptor;
  }

  public void setAcceptor(_FunctionTypes._return_P1_E0<? extends Boolean, ? super SNode> acceptor) {
    myAcceptor = acceptor;
  }

  protected List<SNode> findToChooseFromOnInit(FindUsagesManager manager, FindUsagesManager.ProgressAdapter progressAdapter) {
    Set<SNode> instances = manager.findInstances(this.myTargetConcept, myScope, progressAdapter, false);
    if (this.myAcceptor == null) {
      return ListSequence.fromListWithValues(new ArrayList<SNode>(), instances);
    } else {
      return ListSequence.fromList(ListSequence.fromListWithValues(new ArrayList<SNode>(), instances)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return MainNodeChooser.this.myAcceptor.invoke(it);
        }
      }).toListSequence();
    }
  }

  protected List<SModelDescriptor> getModelDescriptors(String model) {
    return myScope.getModelDescriptors(model);
  }

  protected Iterable<SNode> findNodes(SModel model, final String fqName) {
    return ListSequence.fromList(SModelOperations.getNodes(model, null)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        if (!(it.isInstanceOfConcept(MainNodeChooser.this.myTargetConcept))) {
          return false;
        }
        if (myAcceptor == null) {
          return getFqName(it).equals(fqName);
        } else {
          return myAcceptor.invoke(it) && getFqName(it).equals(fqName);
        }
      }
    });
  }
}
