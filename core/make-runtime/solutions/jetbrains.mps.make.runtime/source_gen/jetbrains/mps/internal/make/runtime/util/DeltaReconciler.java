package jetbrains.mps.internal.make.runtime.util;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.make.delta.IDeltaVisitor;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class DeltaReconciler {
  private List<DeltaReconciler.DeltaContainer> topContainer = ListSequence.fromList(new ArrayList<DeltaReconciler.DeltaContainer>());

  public DeltaReconciler() {
  }

  public DeltaReconciler(Iterable<IDelta> toReconcile) {
    addAll(toReconcile);
  }

  public void addDelta(IDelta delta) {
    DeltaReconciler.DeltaContainer.insert(delta, topContainer);
  }

  public final void addAll(Iterable<IDelta> toReconcile) {
    Sequence.fromIterable(toReconcile).visitAll(new IVisitor<IDelta>() {
      public void visit(IDelta d) {
        DeltaReconciler.DeltaContainer.insert(d, topContainer);
      }
    });
  }

  public void reconcileAll() {
    ListSequence.fromList(topContainer).visitAll(new IVisitor<DeltaReconciler.DeltaContainer>() {
      public void visit(DeltaReconciler.DeltaContainer dc) {
        dc.mergeContent().reconcile();
      }
    });
    final List<IFile> writtenFiles = ListSequence.fromList(new ArrayList<IFile>());
    final List<IFile> deletedFiles = ListSequence.fromList(new ArrayList<IFile>());
    visitAll(new FilesDelta.Visitor() {
      @Override
      public boolean acceptDeleted(IFile file) {
        ListSequence.fromList(deletedFiles).addElement(file);
        return true;
      }

      @Override
      public boolean acceptWritten(IFile file) {
        ListSequence.fromList(writtenFiles).addElement(file);
        return true;
      }
    });
    FileSystem.getInstance().scheduleUpdateForWrittenFiles(writtenFiles);
  }

  public void visitAll(final IDeltaVisitor visitor) {
    ListSequence.fromList(topContainer).visitAll(new IVisitor<DeltaReconciler.DeltaContainer>() {
      public void visit(DeltaReconciler.DeltaContainer dc) {
        dc.mergeContent().acceptVisitor(visitor);
      }
    });
  }

  private static class DeltaContainer {
    private IDelta delta;
    private List<DeltaReconciler.DeltaContainer> content = ListSequence.fromList(new ArrayList<DeltaReconciler.DeltaContainer>());

    private DeltaContainer(IDelta delta) {
      this.delta = delta;
    }

    private IDelta mergeContent() {
      return ListSequence.fromList(content).foldLeft(this.delta, new ILeftCombinator<DeltaReconciler.DeltaContainer, IDelta>() {
        public IDelta combine(IDelta d, DeltaReconciler.DeltaContainer dc) {
          return d.merge(dc.mergeContent());
        }
      });
    }

    private boolean tryInsert(IDelta delta) {
      if (this.delta.contains(delta)) {
        insert(delta, content);
        return true;
      }
      return false;
    }

    private static void insert(final IDelta delta, List<DeltaReconciler.DeltaContainer> into) {
      DeltaReconciler.DeltaContainer dc = null;
      for (Iterator<DeltaReconciler.DeltaContainer> it = ListSequence.fromList(into).iterator(); it.hasNext();) {
        DeltaReconciler.DeltaContainer next = it.next();
        if (delta.contains(next.delta)) {
          if (dc == null) {
            dc = new DeltaReconciler.DeltaContainer(delta);
          }
          ListSequence.fromList(dc.content).addElement(next);
          it.remove();
        }
      }
      if (dc != null) {
        ListSequence.fromList(into).addElement(dc);
      } else if (!(ListSequence.fromList(into).any(new IWhereFilter<DeltaReconciler.DeltaContainer>() {
        public boolean accept(DeltaReconciler.DeltaContainer it) {
          return it.tryInsert(delta);
        }
      }))) {
        ListSequence.fromList(into).addElement(new DeltaReconciler.DeltaContainer(delta));
      }
    }
  }
}
