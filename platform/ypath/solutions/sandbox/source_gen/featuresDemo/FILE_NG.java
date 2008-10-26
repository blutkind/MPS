package featuresDemo;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import java.io.File;
import jetbrains.mps.ypath.runtime.IFilter;
import java.util.AbstractList;
import java.util.AbstractCollection;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;

public class FILE_NG extends TreePath<File> {

  public FILE_NG() {
    this.registerFeature(new FILE_NG.Desc_Feature_children());
    this.registerFeature(new FILE_NG.Desc_Feature_parent());
  }
  public static class DIR_NodeKindTrigger implements IFilter<File> {
private      static FILE_NG.DIR_NodeKindTrigger instance;

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    private DIR_NodeKindTrigger() {
    }
    public DIR_NodeKindTrigger(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public boolean accept(File node) {
      return node.isDirectory();
    }


    public static IFilter<File> getInstance() {
      if (instance == null) {
        instance = new FILE_NG.DIR_NodeKindTrigger();
      }
      return instance;
    }

}
  private static class Feature_children extends AbstractList<File> {

    private File thisNode;

    public Feature_children(File thisNode) {
      this.thisNode = thisNode;
    }

    public File get(int idx) {
      if (idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      return this.thisNode.listFiles()[idx];
    }

    public int size() {
      return (this.thisNode.isDirectory() ?
        this.thisNode.listFiles().length :
        0
      );
    }

}
  private static class Feature_parent extends AbstractCollection<File> {

    private File thisNode;

    public Feature_parent(File thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<File> sequence() {
      return ListSequence.<File>fromArray(this.thisNode.getParentFile());
    }

    public Iterator<File> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return 1;
    }

}
  public static class Desc_Feature_children extends IFeatureDescriptor.Stub<File> implements IFeatureDescriptor<File> {

    public Desc_Feature_children() {
    }

    public Iterable<File> getContents(File node) {
      return new FILE_NG.Feature_children(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "children";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }

}
  public static class Desc_Feature_parent extends IFeatureDescriptor.Stub<File> implements IFeatureDescriptor<File> {

    public Desc_Feature_parent() {
    }

    public Iterable<File> getContents(File node) {
      return new FILE_NG.Feature_parent(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "parent";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return true;
    }

}

}
