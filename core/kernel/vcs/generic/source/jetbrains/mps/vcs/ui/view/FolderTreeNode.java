package jetbrains.mps.vcs.ui.view;

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vcs.ui.IFileController;
import jetbrains.mps.vcs.ui.view.AbstractFileTreeNode;
import jetbrains.mps.vcs.ui.view.FileTreeNode;
import jetbrains.mps.vcs.Status;

import javax.swing.tree.TreeNode;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FolderTreeNode extends AbstractFileTreeNode {
  private static final Set<String> myExcluded = new HashSet<String>();

  static{
    myExcluded.add(".svn");
  }

  public FolderTreeNode(IOperationContext operationContext, IFileController provider, IFile folder) {
    super(operationContext, provider, folder);

    for (IFile f : myFile.list()){
      if (!myExcluded.contains(f.getName()) && f.isDirectory()){
        this.add(createNode(operationContext, provider, f));
      }
    }
    for (IFile f : myFile.list()){
      if (!myExcluded.contains(f.getName()) && !f.isDirectory()){
        this.add(createNode(operationContext, provider, f));
      }
    }
  }

  private static MPSTreeNode createNode(IOperationContext operationContext, IFileController provider, IFile file){
    if (file.isDirectory()){
      return new FolderTreeNode(operationContext, provider, file);
    } else {
      return new FileTreeNode(operationContext, provider, file);
    }
  }

  public List<IFile> getFilesWithStatus(Status... statuses) {
    List<IFile> files = new LinkedList<IFile>();
    files.addAll(super.getFilesWithStatus(statuses));
    for (int i = 0; i < getChildCount(); i++){
      TreeNode child = getChildAt(i);
      if (!(child instanceof AbstractFileTreeNode)){
        throw new IllegalStateException("Tree only consists of file or folder nodes");
      } else {
        files.addAll(((AbstractFileTreeNode)child).getFilesWithStatus(statuses));
      }
    }
    return files;
  }
}
