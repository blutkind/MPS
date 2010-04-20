package jetbrains.mps.ide.projectPane;

import com.intellij.ide.projectView.ProjectView;
import com.intellij.ide.projectView.impl.AbstractProjectViewPane;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.util.ArrayUtil;
import jetbrains.mps.ide.ui.smodel.PackageNode;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ProjectPaneTree extends ProjectTree implements LogicalViewTree{
  private ProjectPane myProjectPane;

  public ProjectPaneTree(ProjectPane projectPane, Project project) {
    super(project);
    myProjectPane = projectPane;

    //drag support is alive while the tree is alive
    DragSource.getDefaultDragSource().createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_MOVE, new MyDragGestureListener());
    new DropTarget(this, new ProjectPaneDnDListener(this, new MyTransferable(null).getTransferDataFlavors()[0]));
    this.enableDnd(myProjectPane);
  }

  public void editNode(final SNode node, IOperationContext context, boolean focus) {
    boolean select = ModelAccess.instance().runReadAction(new Computable<Boolean>() {
      public Boolean compute() {
        return !node.isRoot();
      }
    });
    myProjectPane.editNode(node, context, focus, select);
  }

  public boolean isAutoOpen() {
    return myProjectPane.getProjectView().isAutoscrollToSource(myProjectPane.getId());
  }

  private class MyTransferable implements Transferable {
    private final String mySupportedFlavor = "MPSNodeToMoveFlavor";
    private Object myObject;

    public MyTransferable(Object o) {
      myObject = o;
    }

    public DataFlavor[] getTransferDataFlavors() {
      Class aClass = MyTransferable.class;
      DataFlavor dataFlavor = null;
      try {
        dataFlavor = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType + ";class=" + aClass.getName(),
          mySupportedFlavor, aClass.getClassLoader());
      } catch (ClassNotFoundException ignored) {
      }
      return new DataFlavor[]{dataFlavor};
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
      DataFlavor[] flavors = getTransferDataFlavors();
      return ArrayUtil.find(flavors, flavor) != -1;
    }

    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
      return myObject;
    }
  }

  private class MyDragSourceListener extends DragSourceAdapter {
    public void dragEnter(DragSourceDragEvent dsde) {
      dsde.getDragSourceContext().setCursor(null);
    }

    public void dropActionChanged(DragSourceDragEvent dsde) {
      dsde.getDragSourceContext().setCursor(null);
    }
  }

  private class MyDragGestureListener implements DragGestureListener {
    public void dragGestureRecognized(DragGestureEvent dge) {
      if ((dge.getDragAction() & DnDConstants.ACTION_COPY_OR_MOVE) == 0) return;
      ProjectView projectView = ProjectView.getInstance(myProjectPane.getProject());
      if (projectView == null) return;
      final AbstractProjectViewPane currentPane = projectView.getCurrentProjectViewPane();
      if (!(currentPane instanceof BaseLogicalViewProjectPane)) return;
      List<Pair<SNode, String>> result = new ArrayList<Pair<SNode, String>>();
      for (SNode node : myProjectPane.getSelectedSNodes()) {
        result.add(new Pair(node, ""));
      }
      SModelDescriptor contextDescriptor = myProjectPane.getContextModel();
      if (contextDescriptor != null) {
        for (PackageNode treeNode : myProjectPane.getSelectedTreeNodes(PackageNode.class)) {
          String searchedPack = treeNode.getFullPackage();
          if (treeNode.getChildCount() == 0 || searchedPack == null) continue;
          for (final SNode node : contextDescriptor.getSModel().getRoots()) {
            String nodePack = ModelAccess.instance().runReadAction(new Computable<String>() {
              public String compute() {
                return node.getProperty(BaseConcept.VIRTUAL_PACKAGE);
              }
            });
            if (nodePack == null) continue;
            if (nodePack.startsWith(searchedPack)) {
              StringBuilder basePack = new StringBuilder();
              String firstPart = treeNode.getPackage();
              String secondPart = "";
              if (nodePack.startsWith(searchedPack + ".")) {
                secondPart = nodePack.replaceFirst(searchedPack + ".", "");
              }
              basePack.append(firstPart);
              if (!firstPart.isEmpty() && !secondPart.isEmpty()) {
                basePack.append(".");
              }
              basePack.append(secondPart);
              result.add(new Pair(node, basePack.toString()));
            }
          }
        }
      }
      try {
        dge.startDrag(DragSource.DefaultMoveNoDrop, new MyTransferable(result), new MyDragSourceListener());
      } catch (InvalidDnDOperationException ignored) {
      }
    }
  }
}
