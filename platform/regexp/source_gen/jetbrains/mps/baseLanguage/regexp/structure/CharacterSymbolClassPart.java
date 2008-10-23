package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CharacterSymbolClassPart extends SymbolClassPart {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart";
  public static final String CHARACTER = "character";

  public CharacterSymbolClassPart(SNode node) {
    super(node);
  }

  public String getCharacter() {
    return this.getProperty(CharacterSymbolClassPart.CHARACTER);
  }

  public void setCharacter(String value) {
    this.setProperty(CharacterSymbolClassPart.CHARACTER, value);
  }


  public static CharacterSymbolClassPart newInstance(SModel sm, boolean init) {
    return (CharacterSymbolClassPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CharacterSymbolClassPart newInstance(SModel sm) {
    return CharacterSymbolClassPart.newInstance(sm, false);
  }

}
