package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import com.intellij.openapi.project.Project;
import jetbrains.mps.vcs.diff.changes.ChangeSet;
import java.util.Map;
import jetbrains.mps.smodel.SNodeId;
import java.util.List;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.smodel.SModel;
import com.intellij.openapi.diff.DiffRequest;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vcs.diff.changes.ChangeSetBuilder;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.ui.ScrollPaneFactory;
import javax.swing.JComponent;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.workbench.action.BaseAction;
import java.util.Arrays;
import jetbrains.mps.vcs.diff.changes.ChangeType;
import jetbrains.mps.vcs.diff.changes.AddRootChange;
import jetbrains.mps.vcs.diff.changes.DeleteRootChange;
import jetbrains.mps.internal.collections.runtime.SetSequence;

public class ModelDifferenceDialog extends BaseDialog {
  private Project myProject;
  private ChangeSet myChangeSet;
  private Map<SNodeId, List<ModelChange>> myRootToChanges = MapSequence.fromMap(new HashMap<SNodeId, List<ModelChange>>());
  private List<ModelChange> myMetadataChanges = ListSequence.fromList(new ArrayList<ModelChange>());
  private ModelDifferenceDialog.ModelDifferenceTree myTree;
  private JPanel myPanel = new JPanel(new BorderLayout());
  private boolean myRootsDialogInvoked = false;
  private boolean myGoingToNeighbour = false;
  private String[] myContentTitles;

  public ModelDifferenceDialog(final SModel oldModel, final SModel newModel, DiffRequest diffRequest) {
    super(WindowManager.getInstance().getFrame(diffRequest.getProject()), "Difference for model: " + SModelOperations.getModelName(newModel));
    myProject = diffRequest.getProject();
    DiffTemporaryModule.createModuleForModel(oldModel, "old", myProject);
    DiffTemporaryModule.createModuleForModel(newModel, "new", myProject);
    myContentTitles = diffRequest.getContentTitles();
    assert myContentTitles.length == 2;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myChangeSet = ChangeSetBuilder.buildChangeSet(oldModel, newModel, true);
        fillRootToChange();
      }
    });
    myTree = new ModelDifferenceDialog.ModelDifferenceTree();

    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new InvokeTextDiffAction("View as Text", "View model difference using as text difference of XML contents", this, diffRequest));
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    toolbar.updateActionsImmediately();
    myPanel.add(toolbar.getComponent(), BorderLayout.NORTH);
    myPanel.add(ScrollPaneFactory.createScrollPane(myTree), BorderLayout.CENTER);
  }

  private void fillRootToChange() {
    MapSequence.fromMap(myRootToChanges).clear();
    for (ModelChange c : ListSequence.fromList(myChangeSet.getModelChanges())) {
      SNodeId id = c.getRootId();
      if (id == null) {
        ListSequence.fromList(myMetadataChanges).addElement(c);
      } else {
        if (!(MapSequence.fromMap(myRootToChanges).containsKey(id))) {
          MapSequence.fromMap(myRootToChanges).put(id, ListSequence.fromList(new ArrayList<ModelChange>()));
        }
        ListSequence.fromList(MapSequence.fromMap(myRootToChanges).get(id)).addElement(c);
      }
    }
  }

  /*package*/ void rebuildChangeSet() {
    ChangeSetBuilder.rebuildChangeSet(myChangeSet);
    fillRootToChange();
    myTree.rebuildLater();
  }

  protected JComponent getMainComponent() {
    return myPanel;
  }

  public ChangeSet getChangeSet() {
    return myChangeSet;
  }

  public String[] getContentTitles() {
    return myContentTitles;
  }

  /*package*/ Project getProject() {
    return myProject;
  }

  @Nullable
  public SNodeId getNeighbourRoot(@NotNull SNodeId rootId, boolean next) {
    return myTree.getNeighbourRoot(rootId, next);
  }

  /*package*/ void startGoingToNeighbour() {
    myGoingToNeighbour = true;
  }

  public void invokeRootDifference(final SNodeId rootId) {
    if (rootId == null) {
      StringBuilder sb = new StringBuilder();
      for (ModelChange mc : ListSequence.fromList(myMetadataChanges)) {
        if (mc != ListSequence.fromList(myMetadataChanges).first()) {
          sb.append("\n");
        }
        sb.append(mc);
      }
      Messages.showInfoMessage(this, sb.toString(), "Model Properties Difference");
      return;
    }
    if (myRootsDialogInvoked) {
      return;
    }
    myGoingToNeighbour = false;
    myRootsDialogInvoked = true;
    final Wrappers._T<RootDifferenceDialog> rootDialog = new Wrappers._T<RootDifferenceDialog>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (isVisible()) {
          rootDialog.value = new RootDifferenceDialog(ModelDifferenceDialog.this, rootId, myTree.getNameForRoot(rootId));
        } else {
          rootDialog.value = new RootDifferenceDialog(ModelDifferenceDialog.this, rootId, myTree.getNameForRoot(rootId), WindowManager.getInstance().getFrame(myProject));
        }
      }
    });
    rootDialog.value.showDialog();
    rootDialog.value.toFront();
  }

  /*package*/ void rootDialogClosed() {
    myRootsDialogInvoked = false;
    if (!(myGoingToNeighbour) && !(isVisible())) {
      dispose();
    }
  }

  public List<ModelChange> getChangesForRoot(SNodeId rootId) {
    return MapSequence.fromMap(myRootToChanges).get(rootId);
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return DialogDimensionsSettings.generateDialogDimensions(500, 700);
  }

  private class ModelDifferenceTree extends DiffModelTree {
    private ModelDifferenceTree() {
      super(DiffTemporaryModule.getOperationContext(myProject, myChangeSet.getNewModel()));
    }

    protected Iterable<BaseAction> getRootActions(@Nullable SNodeId rootId) {
      return Arrays.<BaseAction>asList(new InvokeRootDifferenceAction(ModelDifferenceDialog.this, rootId));
    }

    protected void updateRootCustomPresentation(@NotNull DiffModelTree.RootTreeNode rootTreeNode) {
      ChangeType compositeChangeType = ChangeType.CHANGE;
      if (rootTreeNode.getRootId() != null) {
        ModelChange firstChange = ListSequence.fromList(MapSequence.fromMap(myRootToChanges).get(rootTreeNode.getRootId())).first();
        if (firstChange instanceof AddRootChange || firstChange instanceof DeleteRootChange) {
          compositeChangeType = firstChange.getType();
        }
      }
      rootTreeNode.setColor(ChangeColors.getForTree(compositeChangeType));
    }

    protected Iterable<SModel> getModels() {
      return Arrays.asList(myChangeSet.getNewModel(), myChangeSet.getOldModel());
    }

    protected Iterable<SNodeId> getAffectedRoots() {
      return (ListSequence.fromList(myMetadataChanges).isEmpty() ?
        MapSequence.fromMap(myRootToChanges).keySet() :
        SetSequence.fromSet(MapSequence.fromMap(myRootToChanges).keySet()).concat(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<SNodeId>(), null)))
      );
    }
  }
}
