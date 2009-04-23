package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import java.util.ArrayList;

public class MakeFieldVolatile_Intention extends BaseIntention {

  public MakeFieldVolatile_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SPropertyOperations.getBoolean(node, "isVolatile") ?
      "Make field not volatile" :
      "Make field volatile"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "isVolatile", "" + !(SPropertyOperations.getBoolean(node, "isVolatile")));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = new ArrayList<Intention>();
    list.add(this);
    return list;
  }

}
