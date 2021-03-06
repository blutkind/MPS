/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.typesystem.checking;

import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.application.impl.LaterInvocator;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.errors.MessageStatus;
import jetbrains.mps.errors.QuickFixProvider;
import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.newTypesystem.NodeTypesComponent;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.nodeEditor.HighlighterMessage;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.checking.EditorCheckerAdapter;
import jetbrains.mps.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Pair;
import jetbrains.mps.util.WeakSet;

import java.util.*;

public class TypesEditorChecker extends EditorCheckerAdapter {
  private static final Logger LOG = Logger.getLogger(TypesEditorChecker.class);

  public static boolean IMMEDIATE_QFIX_DISABLED = false;

  private WeakSet<QuickFix_Runtime> myOnceExecutedQuickFixes = new WeakSet<QuickFix_Runtime>();
  private boolean myMessagesChanged = false;

  public Set<EditorMessage> createMessages(final SNode node, List<SModelEvent> events, final boolean wasCheckedOnce, final EditorContext editorContext) {
    myMessagesChanged = false;
    final Set<EditorMessage> messages = new LinkedHashSet<EditorMessage>();
    final TypeCheckingContext context = editorContext.getNodeEditorComponent().getTypeCheckingContext();
    if (context == null) return messages;
    context.runTypeCheckingAction(new Runnable() {
      @Override
      public void run() {
        NodeTypesComponent typesComponent = context.getBaseNodeTypesComponent();
        if (!wasCheckedOnce || !context.isCheckedRoot(true) || context.messagesChanged(editorContext.getNodeEditorComponent().getClass())) {
          try {
            myMessagesChanged = true;
            context.checkIfNotChecked(node, false);
          } catch (Throwable t) {
            LOG.error(t);
            typesComponent.setCheckedTypesystem();
            return;
          }
        }

        //non-typesystem checks
        if (!wasCheckedOnce || !typesComponent.isCheckedNonTypesystem()) {
          try {
            myMessagesChanged = true;
            context.setIsNonTypesystemComputation();
            typesComponent.applyNonTypesystemRulesToRoot(editorContext.getOperationContext());
            typesComponent.setCheckedNonTypesystem();
          } catch (Throwable t) {
            LOG.error(t);
            typesComponent.setCheckedNonTypesystem();
          } finally {
            context.resetIsNonTypesystemComputation();
          }
        }

        // highlight nodes with errors
        for (Pair<SNode, List<IErrorReporter>> errorNode : context.getNodesWithErrors()) {
          List<IErrorReporter> errors = new ArrayList<IErrorReporter>(errorNode.o2);
          Collections.sort(errors, new Comparator<IErrorReporter>() {
            public int compare(IErrorReporter o1, IErrorReporter o2) {
              return o2.getMessageStatus().compareTo(o1.getMessageStatus());
            }
          });
          boolean instantIntentionApplied = false;
          for (IErrorReporter errorReporter : errors) {
            MessageStatus status = errorReporter.getMessageStatus();
            String errorString = errorReporter.reportError();
            HighlighterMessage message = HighlightUtil.createHighlighterMessage(
              errorNode.o1,
              NameUtil.capitalize(status.getPresentation()) + ": " + errorString,
              errorReporter,
              TypesEditorChecker.this,
              editorContext
            );
            List<QuickFixProvider> intentionProviders = errorReporter.getIntentionProviders();
            final SNode quickFixNode = errorNode.o1;
            if (intentionProviders.size() == 1 && intentionProviders.get(0) != null && intentionProviders.get(0).isExecutedImmediately() && !IMMEDIATE_QFIX_DISABLED) {
              QuickFixProvider intentionProvider = intentionProviders.get(0);
              if (!instantIntentionApplied) {
                final QuickFix_Runtime intention = intentionProvider.getQuickFix();
                if (intention != null) {
                  instantIntentionApplied = true;
                  if (!myOnceExecutedQuickFixes.contains(intention)) {
                    myOnceExecutedQuickFixes.add(intention);
                    LaterInvocator.invokeLater(new Runnable() {
                      public void run() {
                        EditorCell selectedCell = editorContext.getSelectedCell();
                        if (selectedCell == null) return;
                        boolean restoreCaretPosition = false;
                        int caretX = 0;
                        int caretY = 0;

                        Project p = (editorContext != null && editorContext.getOperationContext() != null ?
                          editorContext.getOperationContext().getProject() :
                          null
                        );
                        if (p == null) {
                          return;
                        }

                        if (selectedCell instanceof EditorCell_Label) {
                          EditorCell_Label cell_label = (EditorCell_Label) selectedCell;
                          restoreCaretPosition = cell_label.getSNode().getAncestors(true).contains(quickFixNode);
                          caretX = cell_label.getCaretX();
                          caretY = cell_label.getBaseline();
                          boolean last = cell_label.getCaretPosition() == cell_label.getText().length();
                          boolean first = cell_label.getCaretPosition() == 0;
                          if (last) {
                            caretX = caretX - 1;
                          }
                          if (first) {
                            caretY = caretY + 1;
                          }
                        }

                        ModelAccess.instance().runUndoTransparentCommand(new Runnable() {
                          public void run() {
                            intention.execute(quickFixNode);
                          }
                        }, p);

                        if (restoreCaretPosition) {
                          editorContext.flushEvents();
                          EditorCell rootCell = editorContext.getNodeEditorComponent().getRootCell();
                          EditorCell leaf = rootCell.findLeaf(caretX, caretY);
                          if (leaf != null) {
                            editorContext.getNodeEditorComponent().changeSelection(leaf);
                            leaf.setCaretX(caretX);
                          }
                        }
                      }
                    }, ModalityState.NON_MODAL);
                  }
                }
              }
            } else {
              for (QuickFixProvider intentionProvider : intentionProviders) {
                if (intentionProvider != null) {
                  intentionProvider.setIsError(status == MessageStatus.ERROR);
                }
                message.addIntentionProvider(intentionProvider);
              }
              messages.add(message);
            }
          }
        }
      }
    });
    return messages;
  }

  protected boolean isPropertyEventDramatical(SModelPropertyEvent event) {
    return true;
  }

  public boolean hasDramaticalEvent(List<SModelEvent> events) {
    return true; //processed in another place
  }

  public boolean areMessagesChanged() {
    return myMessagesChanged;
  }

  public void clear(SNode node, EditorComponent editorComponent) {
    if (node == null) return;
    TypeCheckingContext context = editorComponent.getTypeCheckingContext();
    if (context == null) return;
    context.clear();
  }
}
