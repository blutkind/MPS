package jetbrains.mps.baseLanguage.unitTest.execution.plugin;

/*Generated by MPS */

import com.intellij.ide.OccurenceNavigator;
import javax.swing.event.TreeSelectionListener;
import jetbrains.mps.ide.ui.MPSTreeNode;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import com.intellij.pom.Navigatable;

public abstract class BaseTestOccurenceNavigator implements OccurenceNavigator, TreeSelectionListener {
  protected TestTree testTree;
  protected int selected = -1;
  protected int count;

  public BaseTestOccurenceNavigator(TestTree tree) {
    this.testTree = tree;
    this.testTree.addTreeSelectionListener(this);
  }

  public abstract boolean hasAvailableOccurence(boolean next);

  public abstract boolean accept(MPSTreeNode node);

  public void setNewSelectedIndex(boolean next) {
    boolean founded = false;
    DefaultMutableTreeNode node = this.testTree.getCurrentNode();
    do {
      MPSTreeNode temp = (MPSTreeNode) (next ?
        node.getNextNode() :
        node.getPreviousNode()
      );
      this.selected = this.selected + (next ?
        1 :
        -1
      );
      if (this.accept(temp)) {
        founded = true;
      }
      node = temp;
    } while (!(founded));
  }

  public boolean hasNextOccurence() {
    return this.hasAvailableOccurence(true);
  }

  public boolean hasPreviousOccurence() {
    return this.hasAvailableOccurence(false);
  }

  public OccurenceNavigator.OccurenceInfo goNextOccurence() {
    this.setNewSelectedIndex(true);
    BaseTestOccurenceNavigator.TestNavigator navigator = new BaseTestOccurenceNavigator.TestNavigator();
    navigator.navigate(true);
    return new OccurenceNavigator.OccurenceInfo(navigator, this.selected, this.count);
  }

  public OccurenceNavigator.OccurenceInfo goPreviousOccurence() {
    this.setNewSelectedIndex(false);
    BaseTestOccurenceNavigator.TestNavigator navigator = new BaseTestOccurenceNavigator.TestNavigator();
    navigator.navigate(true);
    return new OccurenceNavigator.OccurenceInfo(navigator, this.selected, this.count);
  }

  public String getNextOccurenceActionName() {
    return "Next test";
  }

  public String getPreviousOccurenceActionName() {
    return "Previous test";
  }

  public void valueChanged(TreeSelectionEvent p0) {
    if (this.testTree == null) {
      return;
    }
    int[] result = this.testTree.getSelectionRows();
    if (result != null && result.length > 0) {
      this.selected = result[0];
    }
    this.count = this.testTree.getRowCount();
  }

  public class TestNavigator implements Navigatable {
    public TestNavigator() {
    }

    public void navigate(boolean p0) {
      BaseTestOccurenceNavigator.this.testTree.setSelectionRows(new int[]{BaseTestOccurenceNavigator.this.selected});
    }

    public boolean canNavigate() {
      return true;
    }

    public boolean canNavigateToSource() {
      return true;
    }
  }
}
