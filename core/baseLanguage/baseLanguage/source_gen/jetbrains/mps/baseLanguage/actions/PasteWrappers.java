package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.datatransfer.PasteWrapper;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.datatransfer.PasteWrapperContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class PasteWrappers {

  public static List<PasteWrapper> createPasteWrappers() {
    List<PasteWrapper> result = new ArrayList();
    result.add(new PasteWrapper() {

      public String getSourceConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.Expression";
      }

      public String getTargetConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.Statement";
      }

      public SNode wrap(PasteWrapperContext _context) {
        SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
        SLinkOperations.setTarget(result, "expression", _context.getSourceNode(), true);
        return result;
      }

    });
    result.add(new PasteWrapper() {

      public String getSourceConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.ExpressionStatement";
      }

      public String getTargetConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.Expression";
      }

      public SNode wrap(PasteWrapperContext _context) {
        return SLinkOperations.getTarget(_context.getSourceNode(), "expression", true);
      }

    });
    result.add(new PasteWrapper() {

      public String getSourceConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement";
      }

      public String getTargetConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration";
      }

      public SNode wrap(PasteWrapperContext _context) {
        return SLinkOperations.getTarget(_context.getSourceNode(), "localVariableDeclaration", true);
      }

    });
    result.add(new PasteWrapper() {

      public String getSourceConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration";
      }

      public String getTargetConceptFqName() {
        return "jetbrains.mps.baseLanguage.structure.Statement";
      }

      public SNode wrap(PasteWrapperContext _context) {
        SNode statement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
        SLinkOperations.setTarget(statement, "localVariableDeclaration", _context.getSourceNode(), true);
        return statement;
      }

    });
    return result;
  }

}
