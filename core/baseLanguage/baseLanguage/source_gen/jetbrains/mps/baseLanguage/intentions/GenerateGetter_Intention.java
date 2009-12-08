package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class GenerateGetter_Intention extends GenerateIntention implements Intention {
  public GenerateGetter_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Getters";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    List<SNode> fields = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return false;
    }
    boolean allGettersImplemented = true;
    for (SNode fieldDeclaration : fields) {
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(fieldDeclaration);
      boolean fieldHasGetter = false;
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return getterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty();
        }
      })) {
        fieldHasGetter = true;
      }
      if (!(fieldHasGetter)) {
        allGettersImplemented = false;
      }
    }
    return !(allGettersImplemented);

  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode lastAdded = null;
    for (final SNode field : ((List<SNode>)intentionContext.getContextParametersMap().get("selectedFields"))) {
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field);
      if (ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return getterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty();
        }
      })) {
        continue;
      }
      // Method creation begins 
      final SNode thisExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
      SNode added = SLinkOperations.addChild(classConcept, "method", new _Quotations.QuotationClass_19().createNode(SLinkOperations.getTarget(field, "type", true), thisExpression, field, getterName));
      lastAdded = added;
    }
    if (lastAdded != null) {
      editorContext.select(lastAdded);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, editorContext.getOperationContext().getMainFrame(), node);
    selectFieldsDialog.showDialog();
    intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
    return selectFieldsDialog.getAnswer();
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
