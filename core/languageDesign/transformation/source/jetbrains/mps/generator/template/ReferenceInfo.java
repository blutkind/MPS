package jetbrains.mps.generator.template;

import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.generator.template.IReferenceResolver;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.helgins.inference.TypeCheckingMode;
import org.jetbrains.annotations.Nullable;

/**
 * Created by: Sergey Dmitriev
 * Date: Jan 25, 2007
 */
public abstract class ReferenceInfo {
  private SNode myOutputSourceNode;
  private String myReferenceRole;
  private SNode myInputNode;

  protected ReferenceInfo(SNode outputSourceNode, String referenceRole, @Nullable SNode inputNode) {
    myOutputSourceNode = outputSourceNode;
    myReferenceRole = referenceRole;
    myInputNode = inputNode;
  }

  public SNode getOutputSourceNode() {
    return myOutputSourceNode;
  }

  public SModelUID getTargetModelUID(TemplateGenerator generator) {
    // local references only
    return generator.getOutputModel().getUID();
  }

  public String getReferenceRole() {
    return myReferenceRole;
  }

  @Nullable
  public SNode getInputNode() {
    return myInputNode;
  }

  public abstract SNode getInputTargetNode();

  /**
   * test postponed references
   */
  public abstract SNode doResolve_Straightforward(TemplateGenerator generator);

  public abstract SNode doResolve_Tricky(TemplateGenerator generator);

  public abstract String getResolveInfoForDynamicResolve();

  public abstract String getResolveInfoForNothing();

  public boolean isRequired() {
    return true;
  }

  public abstract void showErrorMessage(ITemplateGenerator generator);
}
