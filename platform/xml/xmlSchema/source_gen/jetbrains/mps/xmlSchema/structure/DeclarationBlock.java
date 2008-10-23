package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DeclarationBlock extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.DeclarationBlock";
  public static final String TEXT_LINE = "textLine";
  public static final String DECLARATION = "declaration";

  public DeclarationBlock(SNode node) {
    super(node);
  }

  public int getTextLinesCount() {
    return this.getChildCount(DeclarationBlock.TEXT_LINE);
  }

  public Iterator<TextLine> textLines() {
    return this.children(DeclarationBlock.TEXT_LINE);
  }

  public List<TextLine> getTextLines() {
    return this.getChildren(DeclarationBlock.TEXT_LINE);
  }

  public void addTextLine(TextLine node) {
    this.addChild(DeclarationBlock.TEXT_LINE, node);
  }

  public void insertTextLine(TextLine prev, TextLine node) {
    this.insertChild(prev, DeclarationBlock.TEXT_LINE, node);
  }

  public int getDeclarationsCount() {
    return this.getChildCount(DeclarationBlock.DECLARATION);
  }

  public Iterator<Declaration> declarations() {
    return this.children(DeclarationBlock.DECLARATION);
  }

  public List<Declaration> getDeclarations() {
    return this.getChildren(DeclarationBlock.DECLARATION);
  }

  public void addDeclaration(Declaration node) {
    this.addChild(DeclarationBlock.DECLARATION, node);
  }

  public void insertDeclaration(Declaration prev, Declaration node) {
    this.insertChild(prev, DeclarationBlock.DECLARATION, node);
  }


  public static DeclarationBlock newInstance(SModel sm, boolean init) {
    return (DeclarationBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.DeclarationBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DeclarationBlock newInstance(SModel sm) {
    return DeclarationBlock.newInstance(sm, false);
  }

}
