package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.vcs.diff.changes.ChangeType;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vcs.diff.merge.MergeContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class ChangeGroup {
  private Bounds myLeftBounds;
  private Bounds myRightBounds;
  private List<ModelChange> myChanges;
  private ChangeType myChangeType;

  public ChangeGroup(Bounds leftBounds, Bounds rightBounds, List<ModelChange> changes, @Nullable final MergeContext mergeContext) {
    myLeftBounds = leftBounds;
    myRightBounds = rightBounds;
    myChanges = changes;
    myChangeType = ListSequence.fromList(changes).select(new ISelector<ModelChange, ChangeType>() {
      public ChangeType select(ModelChange ch) {
        return ch.getType();
      }
    }).reduceLeft(new ILeftCombinator<ChangeType, ChangeType>() {
      public ChangeType combine(ChangeType a, ChangeType b) {
        return (a == b ?
          a :
          ChangeType.CHANGE
        );
      }
    });
    if (mergeContext != null && ListSequence.fromList(changes).any(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange ch) {
        return Sequence.fromIterable(mergeContext.getConflictedWith(ch)).isNotEmpty();
      }
    })) {
      myChangeType = ChangeType.CONFLICTED;
    }
  }

  public Bounds getLeftBounds() {
    return myLeftBounds;
  }

  public Bounds getRightBounds() {
    return myRightBounds;
  }

  public Bounds getBounds(boolean left) {
    return (left ?
      myLeftBounds :
      myRightBounds
    );
  }

  public List<ModelChange> getChanges() {
    return myChanges;
  }

  public ChangeType getChangeType() {
    return myChangeType;
  }
}
