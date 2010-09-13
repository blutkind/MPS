package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.dialogs.BaseDialog;
import java.awt.BorderLayout;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import javax.swing.JComponent;
import jetbrains.mps.refactoring.framework.IRefactoring;
import java.awt.GridLayout;
import javax.swing.JButton;

public class RefactoringPanel {
  private JPanel myComponent;
  private EditableSModelDescriptor myModel;
  private List<SNode> myRefactorings;
  private IOperationContext myContext;
  private BaseDialog myOwner;

  public RefactoringPanel(EditableSModelDescriptor model, List<SNode> refactorings, IOperationContext context) {
    myModel = model;
    myRefactorings = refactorings;
    myContext = context;
    initComponent();
  }

  private void initComponent() {
    myComponent = new JPanel(new BorderLayout());
    Icon modelIcon = IconManager.getIconFor(myModel);
    String modelName = "<html><b>" + myModel.getLongName() + "</b></html>";
    JLabel modelNameLabel = new JLabel(modelName, modelIcon, SwingConstants.LEADING);
    myComponent.add(modelNameLabel, BorderLayout.PAGE_START);
    List<RefactoringContext> refactoringsContextList = myModel.getRefactoringHistory().getRefactoringContexts();
    JPanel mainPanel = new JPanel(new GridBagLayout());
    mainPanel.setBorder(new TitledBorder("actions"));
    GridBagConstraints gridBagConstraints = new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(4, 8, 4, 8), 0, 0);
    gridBagConstraints.weighty = 0;
    gridBagConstraints.gridy = GridBagConstraints.RELATIVE;
    for (RefactoringContext refactoringContext : refactoringsContextList) {
      addRefactoringItem(refactoringContext, mainPanel, gridBagConstraints);
    }
    myComponent.add(mainPanel, BorderLayout.CENTER);
  }

  public void setOwner(BaseDialog dialog) {
    myOwner = dialog;
  }

  private ActionListener getGoToInformationListener(final RefactoringContext context) {
    return new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        BaseDialog dialog;
        if (context.isEmptyMaps()) {
          dialog = new InformationDialog(myContext, context);
        } else {
          dialog = new InformationDialogWithEditor(myContext, context);
        }
        dialog.showDialog();
      }
    };
  }

  private SNode findRefactoringNode(String name) {
    for (SNode node : myRefactorings) {
      String userFriendlyNodeName = null;
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.refactoring.structure.Refactoring")) {
        userFriendlyNodeName = SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.refactoring.structure.Refactoring"), "userFriendlyName");
      } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.refactoring.structure.OldRefactoring")) {
        userFriendlyNodeName = SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.refactoring.structure.OldRefactoring"), "userFriendlyName");
      }
      if (EqualUtil.equals(userFriendlyNodeName, name)) {
        return node;
      }
    }
    return null;
  }

  private ActionListener getGoToRefactoringListener(final SNode nodeToSelect) {
    return new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        myContext.getComponent(MPSEditorOpener.class).openNode(nodeToSelect, myContext, true, true);
        if (myOwner != null) {
          myOwner.dispose();
        }
      }
    };
  }

  private void addRefactoringItem(RefactoringContext refactoringContext, JComponent component, GridBagConstraints gridBagConstraints) {
    IRefactoring refactoring = refactoringContext.getRefactoring();
    String name = refactoring.getUserFriendlyName();
    if (name == null) {
      component.add(new JLabel("<html><i>Broken refactoring</i></html>"), gridBagConstraints);
      return;
    }
    JComponent itemPanel = new JPanel(new GridLayout(1, 3));
    JLabel refactoringName = new JLabel(name);
    SNode refactoringNode = findRefactoringNode(name);
    itemPanel.add(refactoringName);
    if (refactoringContext.hasInformation()) {
      JButton infoButton = new JButton("Information");
      infoButton.addActionListener(getGoToInformationListener(refactoringContext));
      itemPanel.add(infoButton);
    } else {
      JLabel infoLabel = new JLabel("<html><i>no information</i></html>");
      itemPanel.add(infoLabel);
    }
    if (refactoringNode != null) {
      JButton button = new JButton(SPropertyOperations.getString(SNodeOperations.cast(refactoringNode, "jetbrains.mps.lang.core.structure.INamedConcept"), "name"));
      button.addActionListener(getGoToRefactoringListener(refactoringNode));
      button.setIcon(IconManager.getIconFor(refactoringNode));
      itemPanel.add(button);
    } else {
      JLabel infoLabel = new JLabel("<html><i>action not found</i></html>");
      itemPanel.add(infoLabel);
    }
    component.add(itemPanel, gridBagConstraints);
  }

  public JComponent getComponent() {
    return myComponent;
  }
}
