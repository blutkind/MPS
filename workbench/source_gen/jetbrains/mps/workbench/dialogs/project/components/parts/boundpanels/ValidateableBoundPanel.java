package jetbrains.mps.workbench.dialogs.project.components.parts.boundpanels;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import java.util.List;
import jetbrains.mps.util.Condition;
import javax.swing.DefaultListCellRenderer;
import javax.swing.TransferHandler;
import jetbrains.mps.workbench.dialogs.project.components.parts.validators.Validator;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.BaseValidatedAction;
import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JComponent;
import jetbrains.mps.workbench.dialogs.project.components.parts.CopySupport;
import javax.swing.JScrollPane;
import java.util.Arrays;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ProjectLevelRenderer;
import com.intellij.openapi.actionSystem.AnAction;
import java.util.ArrayList;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public abstract class ValidateableBoundPanel<T> extends JPanel {
  protected IBindedDialog myOwner;
  protected String myCaption;
  protected List<T> myList;
  protected Condition<T> myCanRemoveCondition = Condition.TRUE_CONDITION;
  protected DefaultListCellRenderer myCellRenderer;
  protected TransferHandler myTransferHandler;
  private Validator myObjectValidator = null;
  private Computable<List<T>> myChooser;
  private Boolean myMultipleChooser = null;
  private BaseValidatedAction myAddAction;
  private BaseValidatedAction myRemoveAction;
  private BaseValidatedAction myEditAction;
  private ValidateableBoundPanel.MyValidator myValidator = new ValidateableBoundPanel.MyValidator();
  private boolean myInitialized = false;

  public ValidateableBoundPanel(final IBindedDialog owner, String caption, @NotNull final List<T> list) {
    myOwner = owner;
    myCaption = caption;
    myList = list;
  }

  public void setAddAction(BaseValidatedAction action) {
    assertNotInitialized();
    myAddAction = action;
  }

  public void setRemoveAction(BaseValidatedAction action) {
    assertNotInitialized();
    myRemoveAction = action;
  }

  public void setEditAction(BaseValidatedAction action) {
    assertNotInitialized();
    myEditAction = action;
  }

  public void setChooser(final Computable<T> chooser) {
    assertNotInitialized();
    myMultipleChooser = false;
    myChooser = new Computable<List<T>>() {
      public List<T> compute() {
        return Collections.singletonList(chooser.compute());
      }
    };
  }

  public void setMultipleChooser(Computable<List<T>> chooser) {
    assertNotInitialized();
    myMultipleChooser = true;
    myChooser = chooser;
  }

  public void setCellRenderer(DefaultListCellRenderer cellRenderer) {
    assertNotInitialized();
    myCellRenderer = cellRenderer;
  }

  public void setTransferHandler(TransferHandler transferHandler) {
    assertNotInitialized();
    myTransferHandler = transferHandler;
  }

  public void setObjectValidator(Validator objectValidator) {
    assertNotInitialized();
    myObjectValidator = objectValidator;
  }

  public void setCanRemoveCondition(Condition<T> canRemoveCondition) {
    assertNotInitialized();
    myCanRemoveCondition = (canRemoveCondition != null ?
      canRemoveCondition :
      Condition.TRUE_CONDITION
    );
  }

  public void init() {
    myInitialized = true;
    setBorder(new TitledBorder(myCaption));
    setLayout(new BorderLayout());
    JComponent component = initUIComponentAndBinding();
    if (myTransferHandler != null) {
      component.setTransferHandler(myTransferHandler);
    }
    CopySupport.addCopyPopup(component);
    component.addKeyListener(new ValidateableBoundPanel.MyKeyAdapter());
    JComponent actionsComponent = createActionsComponent();
    if (actionsComponent != null) {
      add(actionsComponent, BorderLayout.WEST);
    }
    JScrollPane comp = new JScrollPane(component);
    comp.doLayout();
    add(comp, BorderLayout.CENTER);
    myValidator.run();
  }

  protected boolean multipleChooserSet() {
    return myMultipleChooser == Boolean.TRUE;
  }

  protected String removeSelectedWithCheck() {
    StringBuilder errorMessage = new StringBuilder();

    int[] indices = getSelectedIndices();
    Arrays.sort(indices);

    for (int i = indices.length - 1; i >= 0; i--) {
      T value = (T) myList.get(indices[i]);
      if (!(myCanRemoveCondition.met(value))) {
        if (errorMessage.length() != 0) {
          errorMessage.append("<br>");
        }
        errorMessage.append("<b>");
        if (myCellRenderer instanceof ProjectLevelRenderer) {
          ProjectLevelRenderer levelRenderer = (ProjectLevelRenderer) myCellRenderer;
          errorMessage.append(levelRenderer.getItemLabel(value));
        } else {
          errorMessage.append(value);
        }
        errorMessage.append("</b>");
        continue;
      }
      myList.remove(indices[i]);
    }
    return errorMessage.toString();
  }

  private JComponent createActionsComponent() {
    if (myMultipleChooser != null) {
      if (myAddAction == null) {
        myAddAction = createAddAction(myChooser);
      }
      if (myRemoveAction == null) {
        myRemoveAction = createRemoveAction();
      }
    }
    List<AnAction> act = new ArrayList<AnAction>();
    if (myAddAction != null) {
      myAddAction.setValidator(myValidator);
      act.add(myAddAction);
    }
    if (myRemoveAction != null) {
      myRemoveAction.setValidator(myValidator);
      act.add(myRemoveAction);
    }
    if (myEditAction != null) {
      myEditAction.setValidator(myValidator);
      act.add(myEditAction);
    }
    AnAction[] actions = act.toArray(new AnAction[act.size()]);
    if (actions.length == 0) {
      return null;
    }
    DefaultActionGroup group = ActionUtils.groupFromActions(actions);
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false);
    return toolbar.getComponent();
  }

  private void assertNotInitialized() {
    assert !(myInitialized);
  }

  protected abstract BaseValidatedAction createAddAction(Computable<List<T>> chooser);

  protected abstract BaseValidatedAction createRemoveAction();

  protected abstract JComponent initUIComponentAndBinding();

  protected abstract int[] getSelectedIndices();

  private class MyValidator implements Runnable {
    private MyValidator() {
    }

    public void run() {
      if (myObjectValidator == null) {
        return;
      }
      if (!((ValidateableBoundPanel.this.getBorder() instanceof TitledBorder))) {
        return;
      }
      TitledBorder titledBorder = (TitledBorder) ValidateableBoundPanel.this.getBorder();
      boolean hasError = false;
      for (T value : myList) {
        if (myObjectValidator.isBrokenValue(value)) {
          hasError = true;
          break;
        }
      }
      titledBorder.setTitleColor((hasError ?
        Color.RED :
        Color.BLACK
      ));
      ValidateableBoundPanel.this.repaint();
    }
  }

  private class MyKeyAdapter extends KeyAdapter {
    private MyKeyAdapter() {
    }

    public void keyPressed(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_INSERT) {
        if (myAddAction != null) {
          ActionUtils.updateAndPerformAction(myAddAction, ActionUtils.createEvent(e));
        }
        e.consume();
      }
      if (e.getKeyCode() == KeyEvent.VK_DELETE) {
        if (myRemoveAction != null) {
          ActionUtils.updateAndPerformAction(myRemoveAction, ActionUtils.createEvent(e));
        }
        e.consume();
      }
    }
  }
}
