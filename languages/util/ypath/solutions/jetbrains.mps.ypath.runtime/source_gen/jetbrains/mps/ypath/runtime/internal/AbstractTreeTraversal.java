package jetbrains.mps.ypath.runtime.internal;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.ITreeTraversal;
import jetbrains.mps.ypath.runtime.TraversalAxis;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import jetbrains.mps.ypath.runtime.ISiblingsFilter;
import jetbrains.mps.ypath.runtime.IFilter;

public abstract class AbstractTreeTraversal<T> implements ITreeTraversal<T> {
  public AbstractTreeTraversal() {
  }

  public ITreeTraversal<T> traverse(TraversalAxis axis) {
    return traverse(axis, (IFeatureDescriptor<T>) null);
  }

  public ITreeTraversal<T> traverse(TraversalAxis axis, String feature) {
    IFeatureDescriptor<T> featureDescriptor = null;
    if (feature != null) {
      featureDescriptor = getTreePath().getFeatureDescriptor(feature);
    }
    return traverse(axis, featureDescriptor);
  }

  public ITreeTraversal<T> traverse(TraversalAxis axis, IFeatureDescriptor<T> featureDesc) {
    switch (axis) {
      case DESCENDANTS:
        return new DescedantsOrThisTreeTraversal<T>(new ChildrenTreeTraversal<T>(this, featureDesc), featureDesc);
      case SELF_DESCENDANTS:
        return new DescedantsOrThisTreeTraversal<T>(this, featureDesc);
      case CHILDREN:
        return new ChildrenTreeTraversal<T>(this, featureDesc);
      case ANCESTORS:
        return new AncestorsOrThisTreeTraversal<T>(new ParentTreeTraversal<T>(this, featureDesc), featureDesc);
      case SELF_ANCESTORS:
        return new AncestorsOrThisTreeTraversal<T>(this, featureDesc);
      case FOLLOWING_SIBLINGS:
        return new SiblingsTreeTraversal<T>(this, new ISiblingsFilter<T>() {
          private boolean accepting;

          public boolean accept(T t) {
            accepting = false;
            return true;
          }

          public boolean accept(T sibling, T thisNode) {
            if (sibling == thisNode || (sibling != null && sibling.equals(thisNode))) {
              accepting = true;
              return false;
            }
            return accepting;
          }
        }, featureDesc);
      case SELF_FOLLOWING_SIBLINGS:
        return new SiblingsTreeTraversal<T>(this, new ISiblingsFilter<T>() {
          private boolean accepting;

          public boolean accept(T t) {
            accepting = false;
            return true;
          }

          public boolean accept(T sibling, T thisNode) {
            if (sibling == thisNode || (sibling != null && sibling.equals(thisNode))) {
              accepting = true;
            }
            return accepting;
          }
        }, featureDesc);
      case PRECEDING_SIBLINGS:
        return new SiblingsTreeTraversal<T>(this, new ISiblingsFilter<T>() {
          private boolean accepting;

          public boolean accept(T t) {
            accepting = true;
            return true;
          }

          public boolean accept(T sibling, T thisNode) {
            if (sibling == thisNode || (sibling != null && sibling.equals(thisNode))) {
              accepting = false;
            }
            return accepting;
          }
        }, featureDesc);
      case PRECEDING_SIBLINGS_SELF:
        return new SiblingsTreeTraversal<T>(this, new ISiblingsFilter<T>() {
          private boolean accepting;

          public boolean accept(T t) {
            accepting = true;
            return true;
          }

          public boolean accept(T sibling, T thisNode) {
            if (sibling == thisNode || (sibling != null && sibling.equals(thisNode))) {
              accepting = false;
              return true;
            }
            return accepting;
          }
        }, featureDesc);
      default:
        break;
    }
    return null;
  }

  public final ITreeTraversal<T> filter(IFilter<T> filter) {
    return new FilteredTreeTraversal<T>(this, filter);
  }
}
