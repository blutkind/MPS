package jetbrains.mps.ide.depanalyzer;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.projectPane.ProjectPane;
import java.awt.Color;
import com.intellij.openapi.project.Project;

public class DependencyTreeNode extends MPSTreeNode {
  private DependencyUtil.Link myLink;
  private boolean myIsLeaf;
  private boolean myIsCyclic;
  private DependencyTreeNode myLinkedNode;
  /**
   * Used during tree building.
   */
  private boolean myUsed;

  public DependencyTreeNode(DependencyUtil.Link link, IOperationContext operationContext) {
    super(link, operationContext);
    myLink = link;
    setIcon(IconManager.getIconFor(getModule()));
    String linktype = (link.linktype == null ?
      "" :
      "<i>" + link.linktype.toString() + "</i> "
    );
    setNodeIdentifier(link.linktype + link.module.getModuleFqName());
    setText("<html>" + linktype + link.module.getModuleFqName() + "</html>");
  }

  public DependencyUtil.Link getLink() {
    return myLink;
  }

  public IModule getModule() {
    return check_akkfj9_a0a1(myLink);
  }

  public void setUsed() {
    myUsed = true;
  }

  public boolean isUsed() {
    return myUsed;
  }

  public void setLeaf() {
    myIsLeaf = true;
    String linktype = (myLink.linktype == null ?
      "" :
      "<i>" + myLink.linktype.toString() + "</i> "
    );
    setText("<html>" + linktype + "<b>" + myLink.module.getModuleFqName() + "</b></html>");
  }

  public void setLinkLeaf(DependencyTreeNode linkedNode) {
    myIsLeaf = true;
    myLinkedNode = linkedNode;
    String linktype = (myLink.linktype == null ?
      "" :
      "<i>" + myLink.linktype.toString() + "</i> "
    );
    setText("<html>" + linktype + myLink.module.getModuleFqName() + "... <b>--></b></html>");
  }

  public boolean isLeaf() {
    return myIsLeaf;
  }

  public void setCyclic() {
    myIsCyclic = true;
  }

  public void doubleClick() {
    if (myLinkedNode == null) {
      ProjectPane.getInstance(check_akkfj9_a0a0a0a8(((DependencyPathTree) getTree()), this)).selectModule(getModule(), false);
    } else {
      getTree().selectNode(myLinkedNode);
    }
  }

  public void doUpdatePresentation() {
    super.doUpdatePresentation();
    if (myIsCyclic) {
      setColor(Color.RED);
    }
  }

  private static IModule check_akkfj9_a0a1(DependencyUtil.Link checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.module;
    }
    return null;
  }

  private static Project check_akkfj9_a0a0a0a8(DependencyPathTree checkedDotOperand, DependencyTreeNode checkedDotThisExpression) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getProject();
    }
    return null;
  }
}
