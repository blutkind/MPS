package jetbrains.mps.baseLanguage.closures.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.Intention;
import java.util.ArrayList;

public class convert_to_unrestricted_Intention extends BaseIntention {

  public convert_to_unrestricted_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
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
    return "Convert to unrestricted function type";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.getConceptDeclaration(node) == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode uft = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType");
    List<SNode> ptypes = SLinkOperations.getTargets(node, "parameterType", true);
    for(SNode pt : ptypes) {
      SLinkOperations.addChild(uft, "parameterType", SNodeOperations.detachNode(pt));
    }
    SLinkOperations.setTarget(uft, "resultType", SNodeOperations.detachNode(SLinkOperations.getTarget(node, "resultType", true)), true);
    List<SNode> ttypes = SLinkOperations.getTargets(node, "throwsType", true);
    for(SNode tt : ttypes) {
      SLinkOperations.addChild(uft, "throwsType", SNodeOperations.detachNode(tt));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.closures.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = new ArrayList<Intention>();
    list.add(this);
    return list;
  }

}
