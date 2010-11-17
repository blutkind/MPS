package jetbrains.mps.vcs.annotation;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.leftHighlighter.AbstractLeftColumn;
import java.awt.Font;
import jetbrains.mps.nodeEditor.EditorSettings;
import java.util.List;
import java.util.Map;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import com.intellij.openapi.vcs.annotate.FileAnnotation;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModel;
import java.awt.Graphics;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Color;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import com.intellij.openapi.vcs.annotate.LineAnnotationAspect;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.IMapping;
import java.util.Collections;
import java.awt.event.MouseEvent;
import org.jetbrains.annotations.Nullable;
import java.awt.Cursor;
import com.intellij.openapi.vcs.annotate.LineAnnotationAspectAdapter;
import javax.swing.JPopupMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import com.intellij.openapi.ide.CopyPasteManager;
import com.intellij.openapi.vcs.history.TextTransferrable;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vcs.versionBrowser.CommittedChangeList;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.vcs.changes.BackgroundFromStartOption;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.vcs.CommittedChangesProvider;
import com.intellij.openapi.vcs.FilePathImpl;
import com.intellij.openapi.vcs.ui.VcsBalloonProblemNotifier;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vcs.changes.Change;
import com.intellij.openapi.vcs.changes.ChangesUtil;
import java.io.File;
import com.intellij.openapi.vcs.changes.ContentRevision;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.vcs.plugin.VcsActionsHelper;
import javax.swing.JFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.vcs.diff.ui.ModelDifferenceDialog;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.diff.ui.RootDifferenceDialog;
import com.intellij.openapi.vcs.VcsException;

public class AnnotationColumn extends AbstractLeftColumn {
  private Font myFont = EditorSettings.getInstance().getDefaultEditorFont();
  private int myWidth = 0;
  private List<Integer> myPseudoLinesY;
  private List<Integer> myPseudoLinesToFileLines;
  private Map<SNodeId, Integer> myNodeIdToFileLine = MapSequence.fromMap(new HashMap<SNodeId, Integer>());
  private FileAnnotation myFileAnnotation;
  private AbstractVcs myVcs;
  private VirtualFile myModelVirtualFile;
  private SModelDescriptor myModelDescriptor;
  private List<SNodeId> myFileLineToId;

  public AnnotationColumn(SNode root, FileAnnotation fileAnnotation, List<SNodeId> fileLineToId, AbstractVcs vcs, VirtualFile modelVirtualFile) {
    Set<SNodeId> descendantIds = SetSequence.fromSetWithValues(new HashSet<SNodeId>(), ListSequence.fromList(SNodeOperations.getDescendants(root, null, true, new String[]{})).select(new ISelector<SNode, SNodeId>() {
      public SNodeId select(SNode n) {
        return n.getSNodeId();
      }
    }));
    SModel model = SNodeOperations.getModel(root);
    myFileAnnotation = fileAnnotation;
    for (int line = 0; line < ListSequence.fromList(fileLineToId).count(); line++) {
      SNode node = null;
      SNodeId id = ListSequence.fromList(fileLineToId).getElement(line);
      if (id != null && SetSequence.fromSet(descendantIds).contains(id)) {
        node = model.getNodeById(id);
      }
      if (node == null) {
        continue;
      }
      if (MapSequence.fromMap(myNodeIdToFileLine).containsKey(id)) {
        MapSequence.fromMap(myNodeIdToFileLine).put(id, getFileLineWithMaxRevision(MapSequence.fromMap(myNodeIdToFileLine).get(id), line));
      } else {
        MapSequence.fromMap(myNodeIdToFileLine).put(id, line);
      }
    }
    myModelVirtualFile = modelVirtualFile;
    myModelDescriptor = model.getModelDescriptor();
    myFileLineToId = fileLineToId;
    myVcs = vcs;
  }

  public String getName() {
    return "Annotations";
  }

  public void paint(Graphics graphics, EditorComponent component) {
    graphics.setFont(myFont);
    graphics.setColor(Color.BLACK);
    for (int i = 0; i < ListSequence.fromList(myPseudoLinesY).count(); i++) {
      String text = getTextForFileLine(ListSequence.fromList(myPseudoLinesToFileLines).getElement(i));
      graphics.drawString(text, 1, graphics.getFontMetrics().getAscent() + ListSequence.fromList(myPseudoLinesY).getElement(i));
    }
  }

  private String getTextForFileLine(final int fileLine) {
    final StringBuffer sb = new StringBuffer();
    Sequence.fromIterable(Sequence.fromArray(myFileAnnotation.getAspects())).visitAll(new IVisitor<LineAnnotationAspect>() {
      public void visit(LineAnnotationAspect a) {
        sb.append(" ").append(a.getValue(fileLine));
      }
    });
    return sb.substring(1);
  }

  public int getWidth() {
    return myWidth;
  }

  public void relayout(final EditorComponent component) {
    if (component == null || component.isDisposed()) {
      return;
    }
    Iterable<EditorCell> nonTrivialCells = Sequence.fromIterable(EditorUtils.getCellDescendants(component.getRootCell())).where(new IWhereFilter<EditorCell>() {
      public boolean accept(EditorCell cell) {
        return cell.getWidth() * cell.getHeight() != 0;
      }
    });
    Set<Integer> yCoordinatesSet = SetSequence.fromSetWithValues(new HashSet<Integer>(), Sequence.fromIterable(nonTrivialCells).select(new ISelector<EditorCell, Integer>() {
      public Integer select(EditorCell cell) {
        return cell.getY();
      }
    }));
    myPseudoLinesY = SetSequence.fromSet(yCoordinatesSet).sort(new ISelector<Integer, Comparable<?>>() {
      public Comparable<?> select(Integer y) {
        return y;
      }
    }, true).toListSequence();
    myPseudoLinesToFileLines = ListSequence.fromList(new ArrayList<Integer>());
    ListSequence.fromList(myPseudoLinesY).visitAll(new IVisitor<Integer>() {
      public void visit(Integer t) {
        ListSequence.fromList(myPseudoLinesToFileLines).addElement(-1);
      }
    });
    myWidth = 0;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SModel model = component.getEditedNode().getModel();
        for (IMapping<SNodeId, Integer> nodeIdToFileLine : MapSequence.fromMap(myNodeIdToFileLine)) {
          final SNode node = model.getNodeById(nodeIdToFileLine.key());
          int fileLine = nodeIdToFileLine.value();

          EditorCell cell = ListSequence.fromList(SNodeOperations.getAncestors(node, null, true)).select(new ISelector<SNode, EditorCell>() {
            public EditorCell select(SNode n) {
              return component.findNodeCell(node);
            }
          }).findFirst(new IWhereFilter<EditorCell>() {
            public boolean accept(EditorCell c) {
              return c != null;
            }
          });
          if (cell == null) {
            continue;
          }

          int startPseudoLine = Collections.binarySearch(myPseudoLinesY, cell.getY());
          int endPseudoLine = Collections.binarySearch(myPseudoLinesY, cell.getY() + cell.getHeight());
          if (endPseudoLine < 0) {
            endPseudoLine = -endPseudoLine - 1;
          }
          for (int pseudoLine = startPseudoLine; pseudoLine < endPseudoLine; pseudoLine++) {
            int currentFileLine = ListSequence.fromList(myPseudoLinesToFileLines).getElement(pseudoLine);
            ListSequence.fromList(myPseudoLinesToFileLines).setElement(pseudoLine, getFileLineWithMaxRevision(currentFileLine, fileLine));
          }
          int widthCandidate = component.getGraphics().getFontMetrics(myFont).stringWidth(getTextForFileLine(fileLine)) + 3;
          myWidth = Math.max(myWidth, widthCandidate);
        }
      }
    });
  }

  @Override
  public String getTooltipText(MouseEvent event) {
    int fileLine = findFileLineByY(event.getY());
    if (fileLine != -1) {
      return myFileAnnotation.getToolTip(fileLine);
    }
    return null;
  }

  @Nullable
  @Override
  public Cursor getCursor(MouseEvent event, EditorComponent component) {
    return new Cursor(Cursor.HAND_CURSOR);
  }

  @Override
  public void mousePressed(MouseEvent event, EditorComponent component) {
    if (event.getButton() == MouseEvent.BUTTON1 && event.getID() == MouseEvent.MOUSE_RELEASED) {
      event.consume();
      int fileLine = findFileLineByY(event.getY());
      ((LineAnnotationAspectAdapter) myFileAnnotation.getAspects()[0]).doAction(fileLine);
    } else {
      super.mousePressed(event, component);
    }
  }

  private int findPseudoLineByY(int y) {
    int pseudoLine = Collections.binarySearch(myPseudoLinesY, y);
    if (pseudoLine < 0) {
      pseudoLine = -pseudoLine - 2;
    }
    if (pseudoLine < 0 || pseudoLine >= ListSequence.fromList(myPseudoLinesToFileLines).count()) {
      return -1;
    }
    return pseudoLine;
  }

  private int findFileLineByY(int y) {
    int pseudoLine = findPseudoLineByY(y);
    if (pseudoLine != -1) {
      return ListSequence.fromList(myPseudoLinesToFileLines).getElement(pseudoLine);
    }
    return -1;
  }

  @Override
  public JPopupMenu getPopupMenu(MouseEvent event) {
    JPopupMenu menu = new JPopupMenu();
    final int fileLine = findFileLineByY(event.getY());
    menu.add(new AnnotationColumn.ShowDiffFromAnnotationAction(fileLine));
    menu.add(new AbstractAction("Copy revision number") {
      public void actionPerformed(ActionEvent e) {
        String asString = myFileAnnotation.getLineRevisionNumber(fileLine).asString();
        CopyPasteManager.getInstance().setContents(new TextTransferrable(asString, asString));
      }
    });
    return menu;
  }

  private int getFileLineWithMaxRevision(int a, int b) {
    if (b == -1) {
      return a;
    }
    if (a == -1) {
      return b;
    }
    VcsRevisionNumber aRevision = myFileAnnotation.getLineRevisionNumber(a);
    VcsRevisionNumber bRevision = myFileAnnotation.getLineRevisionNumber(b);
    if (bRevision == null) {
      return a;
    }
    if (aRevision == null) {
      return b;
    }
    int c = aRevision.compareTo(bRevision);
    if (c < 0) {
      return b;
    }
    return a;
  }

  private static FilePath check_5mnya_a0a2a2a0a0a0a1a1a0a(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getSecond();
  }

  private static FilePath check_5mnya_a0a0c0c0a0a0a0b0b0a0(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getSecond();
  }

  private static CommittedChangeList check_5mnya_a0d0c0a0a0a0b0b0a0(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getFirst();
  }

  private class ShowDiffFromAnnotationAction extends AbstractAction {
    private int myFileLine;

    public ShowDiffFromAnnotationAction(int fileLine) {
      super("Show Diff");
      myFileLine = fileLine;
    }

    public void actionPerformed(ActionEvent e) {
      final VcsRevisionNumber revisionNumber = myFileAnnotation.getLineRevisionNumber(myFileLine);
      if (revisionNumber != null) {
        final Project project = myVcs.getProject();
        ProgressManager.getInstance().run(new Task.Backgroundable(project, "Loading revision " + revisionNumber.asString() + " contents", true, BackgroundFromStartOption.getInstance()) {
          public void run(@NotNull ProgressIndicator pi) {
            CommittedChangesProvider provider = myVcs.getCommittedChangesProvider();

            try {
              Pair<CommittedChangeList, FilePath> pair = null;
              if (provider != null) {
                pair = provider.getOneList(myModelVirtualFile, revisionNumber);
              }
              FilePath targetPath = (check_5mnya_a0a0c0c0a0a0a0b0b0a0(pair) == null ?
                new FilePathImpl(myModelVirtualFile) :
                check_5mnya_a0a2a2a0a0a0a1a1a0a(pair)
              );
              CommittedChangeList cl = check_5mnya_a0d0c0a0a0a0b0b0a0(pair);
              if (cl == null) {
                VcsBalloonProblemNotifier.showOverChangesView(project, "Cannot load data for showing diff", MessageType.ERROR);
                return;
              }
              List<Change> changes = Sequence.fromIterable(((Iterable<Change>) cl.getChanges())).sort(new ISelector<Change, Comparable<?>>() {
                public Comparable<?> select(Change c) {
                  return ChangesUtil.getFilePath(c).getName().toLowerCase();
                }
              }, true).toListSequence();
              final File ioFile = targetPath.getIOFile();
              Change change = ListSequence.fromList(changes).findFirst(new IWhereFilter<Change>() {
                public boolean accept(Change c) {
                  return c.getAfterRevision() != null && c.getAfterRevision().getFile().getIOFile().equals(ioFile);
                }
              });
              if (change != null) {
                final String name = ioFile.getName();
                change = ListSequence.fromList(changes).findFirst(new IWhereFilter<Change>() {
                  public boolean accept(Change c) {
                    return c.getAfterRevision() != null && c.getAfterRevision().getFile().getName().equals(name);
                  }
                });

                ContentRevision before = change.getBeforeRevision();
                ContentRevision after = change.getAfterRevision();

                if (pi.isCanceled()) {
                  return;
                }
                pi.setText("Loading model before change");

                final Wrappers._T<SModel> beforeModel = new Wrappers._T<SModel>();
                if (before == null) {
                  beforeModel.value = new SModel(myModelDescriptor.getSModelReference());
                } else {
                  beforeModel.value = VcsActionsHelper.loadModel(before.getContent(), myModelDescriptor);
                }

                if (pi.isCanceled()) {
                  return;
                }

                pi.setText("Loading model after change");
                assert after != null;
                final SModel afterModel = VcsActionsHelper.loadModel(after.getContent(), myModelDescriptor);

                final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
                ModelAccess.instance().runReadAction(new Runnable() {
                  public void run() {
                    SNodeId nodeId = ListSequence.fromList(myFileLineToId).getElement(myFileLine);
                    node.value = afterModel.getNodeById(nodeId);
                    if ((node.value == null)) {
                      node.value = beforeModel.value.getNodeById(nodeId);
                    }
                    node.value = SNodeOperations.getContainingRoot(node.value);
                  }
                });

                final JFrame frame = WindowManager.getInstance().getFrame(project);
                final ModuleContext operationContext = new ModuleContext(myModelDescriptor.getModule(), project);
                final String beforeRevNumber = (before == null ?
                  "<no revision>" :
                  before.getRevisionNumber().asString()
                );
                final String afterRevNumber = after.getRevisionNumber().asString();
                if (node.value == null) {
                  ModelAccess.instance().runReadInEDT(new Runnable() {
                    public void run() {
                      final ModelDifferenceDialog dialog = new ModelDifferenceDialog(operationContext, frame, beforeModel.value, afterModel, "Model Difference", false, new String[]{beforeRevNumber, afterRevNumber});
                      ApplicationManager.getApplication().invokeLater(new Runnable() {
                        public void run() {
                          dialog.showDialog();
                        }
                      });
                    }
                  });

                } else {
                  ModelAccess.instance().runReadInEDT(new Runnable() {
                    public void run() {
                      final RootDifferenceDialog dialog = new RootDifferenceDialog(frame, afterModel, beforeModel.value, false, false);
                      dialog.init(operationContext, node.value, afterRevNumber, beforeRevNumber);
                      ApplicationManager.getApplication().invokeLater(new Runnable() {
                        public void run() {
                          dialog.showDialog();
                        }
                      });
                    }
                  });
                }
              }
            } catch (final VcsException ve) {
              ApplicationManager.getApplication().invokeLater(new Runnable() {
                public void run() {
                  VcsBalloonProblemNotifier.showOverChangesView(project, "Cannot show diff: " + ve.getMessage(), MessageType.ERROR);
                }
              });
            }
          }
        });
      }
    }
  }
}
