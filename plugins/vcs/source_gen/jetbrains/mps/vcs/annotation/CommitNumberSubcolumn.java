package jetbrains.mps.vcs.annotation;

/*Generated by MPS */

import com.intellij.openapi.vcs.annotate.FileAnnotation;
import java.util.Map;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Comparator;
import java.awt.FontMetrics;

public class CommitNumberSubcolumn extends AnnotationAspectSubcolumn {
  private FileAnnotation myFileAnnotation;
  private Map<VcsRevisionNumber, Integer> myRevisionsToNumbers;

  public CommitNumberSubcolumn(FileAnnotation fileAnnotation) {
    super(null);
    myFileAnnotation = fileAnnotation;
  }

  @Override
  public String getTextForFileLine(int fileLine) {
    return "" + MapSequence.fromMap(myRevisionsToNumbers).get(myFileAnnotation.getLineRevisionNumber(fileLine));
  }

  private void computeNumbers(Iterable<Integer> fileLines) {
    myRevisionsToNumbers = MapSequence.fromMap(new HashMap<VcsRevisionNumber, Integer>());
    List<VcsRevisionNumber> revisionNumbers = SetSequence.fromSet(SetSequence.fromSetWithValues(new HashSet<VcsRevisionNumber>(), Sequence.fromIterable(fileLines).select(new ISelector<Integer, VcsRevisionNumber>() {
      public VcsRevisionNumber select(Integer fl) {
        return myFileAnnotation.getLineRevisionNumber(fl);
      }
    }))).toListSequence();
    ListSequence.fromList(revisionNumbers).sort(new Comparator<VcsRevisionNumber>() {
      public int compare(VcsRevisionNumber a, VcsRevisionNumber b) {
        return a.compareTo(b);
      }
    }, true);
    for (int i = 0; i < ListSequence.fromList(revisionNumbers).count(); i++) {
      MapSequence.fromMap(myRevisionsToNumbers).put(ListSequence.fromList(revisionNumbers).getElement(i), i + 1);
    }
  }

  @Override
  public void computeWidth(FontMetrics fontMetrics, Iterable<Integer> fileLines) {
    super.computeWidth(fontMetrics, fileLines);
    computeNumbers(fileLines);
  }
}
