package jetbrains.mps.baseLanguage.javadoc.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.javadoc.editor.NodeCaretPair;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class HTMLElement_Behavior {
  public static void init(SNode thisNode) {
    SLinkOperations.addNewChild(thisNode, "line", "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine");
  }

  public static NodeCaretPair virtual_smartDelete_9042833497008205283(SNode thisNode, boolean isBeginning) {
    SNode line = SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine");
    int index = SNodeOperations.getIndexInParent(thisNode);
    Iterable<SNode> lines = SLinkOperations.getTargets(thisNode, "line", true);

    SNode nodeToSelect = null;
    int caret = -1;

    if (Sequence.fromIterable(lines).count() == 0) {
      SNode prev = SNodeOperations.getPrevSibling(thisNode);
      if (StringUtils.isNotEmpty(SPropertyOperations.getString(SNodeOperations.cast(prev, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text"))) {
        caret = SPropertyOperations.getString(SNodeOperations.cast(prev, "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text").length();
      }
      SNodeOperations.deleteNode(thisNode);
      CommentLine_Behavior.call_tryMergeToRight_439148907936414403(line, index - 1);
      return new NodeCaretPair(prev, caret);
    } else {
      //  Merging first line
      for (SNode part : ListSequence.fromList(SLinkOperations.getTargets(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "line", true)).first(), "part", true))) {
        SNodeOperations.insertPrevSiblingChild(thisNode, part);
      }
      SNodeOperations.deleteNode(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "line", true)).first());
      if (isBeginning) {
        nodeToSelect = ListSequence.fromList(SLinkOperations.getTargets(line, "part", true)).getElement(index - 1);
        caret = SPropertyOperations.getString(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(line, "part", true)).getElement(index - 1), "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text").length();
      }
      CommentLine_Behavior.call_tryMergeToRight_439148907936414403(line, index - 1);

      //  Merging other lines
      SNode lastElementLine = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "line", true)).last();
      for (SNode elementLine : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "line", true)).reversedList()) {
        SNodeOperations.insertNextSiblingChild(line, elementLine);
      }

      if ((lastElementLine == null)) {
        index = SNodeOperations.getIndexInParent(thisNode);
        SNodeOperations.deleteNode(thisNode);
        if (!(isBeginning)) {
          nodeToSelect = ListSequence.fromList(SLinkOperations.getTargets(line, "part", true)).getElement(index - 1);
          caret = SPropertyOperations.getString(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(line, "part", true)).getElement(index - 1), "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text").length();
        }
        CommentLine_Behavior.call_tryMergeToRight_439148907936414403(line, index - 1);
      } else {
        //  Merging last line parts
        index = ListSequence.fromList(SLinkOperations.getTargets(lastElementLine, "part", true)).count() - 1;
        for (SNode linePart : ListSequence.fromList(SNodeOperations.getNextSiblings(thisNode, false))) {
          SLinkOperations.addChild(lastElementLine, "part", SNodeOperations.cast(linePart, "jetbrains.mps.baseLanguage.javadoc.structure.CommentLinePart"));
        }
        SNodeOperations.deleteNode(thisNode);
        if (!(isBeginning)) {
          nodeToSelect = ListSequence.fromList(SLinkOperations.getTargets(lastElementLine, "part", true)).getElement(index);
          caret = SPropertyOperations.getString(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(lastElementLine, "part", true)).getElement(index), "jetbrains.mps.baseLanguage.javadoc.structure.TextCommentLinePart"), "text").length();
        }
        CommentLine_Behavior.call_tryMergeToRight_439148907936414403(lastElementLine, index);
      }
    }
    return new NodeCaretPair(nodeToSelect, caret);
  }
}
