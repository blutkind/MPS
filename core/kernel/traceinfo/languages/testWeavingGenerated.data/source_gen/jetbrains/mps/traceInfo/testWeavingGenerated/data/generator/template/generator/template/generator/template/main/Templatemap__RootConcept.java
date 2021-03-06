package jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;

public class Templatemap__RootConcept implements TemplateDeclaration {
  private static SNodePointer template_56x90y_a0a0 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490321");
  private static SNodePointer templateNode_56x90y_a0a0a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490321");
  private static SNodePointer propertyMacro_56x90y_c0b0b0a2a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490328");
  private static SNodePointer templateNode_56x90y_a0a0a1a4a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490322");
  private static SNodePointer templateNode_56x90y_a0a0a1a5a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490323");
  private static SNodePointer templateNode_56x90y_a0a0a1a3a1a5a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490324");
  private static SNodePointer templateNode_56x90y_a0a0a1a4a1a5a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490325");
  private static SNodePointer templateNode_56x90y_a0a0a1a5a1a5a1a1 = new SNodePointer("r:592e27b6-d258-4bf2-9e32-25019862e1f1(jetbrains.mps.traceInfo.testWeavingGenerated.data.generator.template.generator.template.generator.template.main@generator)", "6186432342008490326");

  public Templatemap__RootConcept() {
  }

  public SNodePointer getTemplateNode() {
    return template_56x90y_a0a0;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false);
    try {
      environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a1);
      environment.nodeCopied(context, tnode1, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490321");
      tnode1.setProperty("name", TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_6186432342008490331(environment.getOperationContext(), new PropertyMacroContext(context.getInput(), "map_RootConcept", propertyMacro_56x90y_c0b0b0a2a1a1, context, environment.getGenerator()))));

      {
        final SNode tnode2 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a4a1a1);
          environment.nodeCopied(context, tnode2, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490322");

        } finally {
          environment.getTracer().pushOutputNode(tnode2);
          environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a4a1a1);
        }
        if (tnode2 != null) {
          tnode1.addChild("visibility", tnode2);
        }
        // TODO validate child 
      }
      {
        final SNode tnode3 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration", false);
        try {
          environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a5a1a1);
          environment.nodeCopied(context, tnode3, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490323");

          {
            final SNode tnode4 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.VoidType", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a3a1a5a1a1);
              environment.nodeCopied(context, tnode4, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490324");

            } finally {
              environment.getTracer().pushOutputNode(tnode4);
              environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a3a1a5a1a1);
            }
            if (tnode4 != null) {
              tnode3.addChild("returnType", tnode4);
            }
            // TODO validate child 
          }
          {
            final SNode tnode5 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.PublicVisibility", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a4a1a5a1a1);
              environment.nodeCopied(context, tnode5, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490325");

            } finally {
              environment.getTracer().pushOutputNode(tnode5);
              environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a4a1a5a1a1);
            }
            if (tnode5 != null) {
              tnode3.addChild("visibility", tnode5);
            }
            // TODO validate child 
          }
          {
            final SNode tnode6 = new SNode(environment.getOutputModel(), "jetbrains.mps.baseLanguage.structure.StatementList", false);
            try {
              environment.getTracer().pushTemplateNode(templateNode_56x90y_a0a0a1a5a1a5a1a1);
              environment.nodeCopied(context, tnode6, "tpl/r:592e27b6-d258-4bf2-9e32-25019862e1f1/6186432342008490326");

            } finally {
              environment.getTracer().pushOutputNode(tnode6);
              environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a5a1a5a1a1);
            }
            if (tnode6 != null) {
              tnode3.addChild("body", tnode6);
            }
            // TODO validate child 
          }
        } finally {
          environment.getTracer().pushOutputNode(tnode3);
          environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a5a1a1);
        }
        if (tnode3 != null) {
          tnode1.addChild("constructor", tnode3);
        }
        // TODO validate child 
      }
    } finally {
      environment.getTracer().pushOutputNode(tnode1);
      environment.getTracer().closeTemplateNode(templateNode_56x90y_a0a0a1a1);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}
