package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.generator.runtime.NodeMapper;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import jetbrains.mps.generator.runtime.PostProcessor;
import jetbrains.mps.generator.template.MapSrcMacroPostProcContext;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class TemplateOutputRoot_2 implements TemplateDeclaration {
  private static SNodePointer loopMacroRef_rz5qmw_a0a0a1a4a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338467104");
  private static SNodePointer loopMacroRef_rz5qmw_a0a0a3a2a2a1a4a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338467111");
  private static SNodePointer loopMacroRef_rz5qmw_a0a0a3a2a2a3a2a2a1a4a0 = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338467118");

  public TemplateOutputRoot_2() {
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull final TemplateContext context) throws GenerationException {
    final SNode tnode1 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputRoot", false);
    // TODO notify environment 
    tnode1.setProperty("name", "OutputRoot_2");
    tnode1.setProperty("text", "'getPrevInputTest' output root (2)");
    {
      final List<SNode> tlist2 = new ArrayList();
      try {
        environment.getTracer().pushMacro(loopMacroRef_rz5qmw_a0a0a1a4a0);
        final Iterable<SNode> loopList2 = QueriesGenerated.sourceNodesQuery_1202338467105(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context.getInput(), null, null, context, environment.getGenerator()));
        for (SNode itnode2 : loopList2) {
          if (itnode2 == null) {
            continue;
          }
          boolean inputChanged2 = context.getInput() != itnode2;
          try {
            if (inputChanged2) {
              environment.getTracer().pushInputNode(itnode2);
            }
            TemplateContext context2 = context.subContext("LEVEL 1", itnode2);
            final List<SNode> tlist3 = new ArrayList();
            try {
              environment.getTracer().pushMacro(loopMacroRef_rz5qmw_a0a0a3a2a2a1a4a0);
              final Iterable<SNode> loopList3 = QueriesGenerated.sourceNodesQuery_1202338467112(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context2.getInput(), null, null, context2, environment.getGenerator()));
              for (SNode itnode3 : loopList3) {
                if (itnode3 == null) {
                  continue;
                }
                boolean inputChanged3 = context2.getInput() != itnode3;
                try {
                  if (inputChanged3) {
                    environment.getTracer().pushInputNode(itnode3);
                  }
                  TemplateContext context3 = context2.subContext("LEVEL 2", itnode3);
                  final List<SNode> tlist4 = new ArrayList();
                  try {
                    environment.getTracer().pushMacro(loopMacroRef_rz5qmw_a0a0a3a2a2a3a2a2a1a4a0);
                    final Iterable<SNode> loopList4 = QueriesGenerated.sourceNodesQuery_1202338467119(environment.getOperationContext(), new SourceSubstituteMacroNodesContext(context3.getInput(), null, null, context3, environment.getGenerator()));
                    for (SNode itnode4 : loopList4) {
                      if (itnode4 == null) {
                        continue;
                      }
                      boolean inputChanged4 = context3.getInput() != itnode4;
                      try {
                        if (inputChanged4) {
                          environment.getTracer().pushInputNode(itnode4);
                        }
                        TemplateContext context4 = context3.subContext(null, itnode4);
                        final SNode tnode5 = new SNode(null, "jetbrains.mps.transformation.test.outputLang.structure.OutputNode", false);
                        // TODO notify environment 
                        tnode5.setProperty("text", (String) QueriesGenerated.propertyMacro_GetPropertyValue_1202338467126(null, new PropertyMacroContext(context4.getInput(), null, null, context4, null)));
                        {
                          final SNode sourceNode6 = context.getInput();
                          final List<SNode> tlist6 = new ArrayList();
                          tlist6.add(environment.insertLater(new NodeMapper() {
                            public SNode map(SNode outputNode, TemplateContext mapContext) {
                              return QueriesGenerated.mapSrcMacro_mapper_1202338546473(environment.getOperationContext(), new MapSrcMacroContext(mapContext.getInput(), null, outputNode.getParent(), mapContext, environment.getGenerator()));
                            }
                          }, new PostProcessor() {
                            public void process(SNode outputNode, TemplateContext postProcessContext) {
                              QueriesGenerated.mapSrcMacro_post_mapper_1225236090395(environment.getOperationContext(), new MapSrcMacroPostProcContext(postProcessContext.getInput(), null, outputNode, postProcessContext, environment.getGenerator()));
                            }
                          }, context4));
                          for (SNode child7 : tlist6) {
                            tnode5.addChild("outputChild", child7);
                          }
                        }
                        {
                          final SNode sourceNode8 = context.getInput();
                          final List<SNode> tlist8 = new ArrayList();
                          tlist8.add(environment.insertLater(new NodeMapper() {
                            public SNode map(SNode outputNode, TemplateContext mapContext) {
                              return QueriesGenerated.mapSrcMacro_mapper_1202338683284(environment.getOperationContext(), new MapSrcMacroContext(mapContext.getInput(), null, outputNode.getParent(), mapContext, environment.getGenerator()));
                            }
                          }, null, context4));
                          for (SNode child9 : tlist8) {
                            tnode5.addChild("outputChild", child9);
                          }
                        }
                        {
                          final SNode sourceNode10 = context.getInput();
                          final List<SNode> tlist10 = new ArrayList();
                          tlist10.add(environment.insertLater(new NodeMapper() {
                            public SNode map(SNode outputNode, TemplateContext mapContext) {
                              return QueriesGenerated.mapSrcMacro_mapper_1202338740199(environment.getOperationContext(), new MapSrcMacroContext(mapContext.getInput(), null, outputNode.getParent(), mapContext, environment.getGenerator()));
                            }
                          }, new PostProcessor() {
                            public void process(SNode outputNode, TemplateContext postProcessContext) {
                              QueriesGenerated.mapSrcMacro_post_mapper_1225236639046(environment.getOperationContext(), new MapSrcMacroPostProcContext(postProcessContext.getInput(), null, outputNode, postProcessContext, environment.getGenerator()));
                            }
                          }, context4));
                          for (SNode child11 : tlist10) {
                            tnode5.addChild("outputChild", child11);
                          }
                        }
                        if (tnode5 != null) {
                          tlist4.add(tnode5);
                        }
                      } finally {
                        if (inputChanged4) {
                          environment.getTracer().closeInputNode(itnode4);
                        }
                      }
                    }

                  } finally {
                    environment.getTracer().closeMacro(loopMacroRef_rz5qmw_a0a0a3a2a2a3a2a2a1a4a0);
                  }
                  if (tlist4 != null) {
                    environment.registerLabel(itnode3, tlist4, "LEVEL 2");
                    tlist3.addAll(tlist4);
                  }
                } finally {
                  if (inputChanged3) {
                    environment.getTracer().closeInputNode(itnode3);
                  }
                }
              }

            } finally {
              environment.getTracer().closeMacro(loopMacroRef_rz5qmw_a0a0a3a2a2a1a4a0);
            }
            if (tlist3 != null) {
              environment.registerLabel(itnode2, tlist3, "LEVEL 1");
              tlist2.addAll(tlist3);
            }
          } finally {
            if (inputChanged2) {
              environment.getTracer().closeInputNode(itnode2);
            }
          }
        }

      } finally {
        environment.getTracer().closeMacro(loopMacroRef_rz5qmw_a0a0a1a4a0);
      }
      for (SNode child12 : tlist2) {
        tnode1.addChild("outputChild", child12);
      }
    }
    return TemplateUtil.singletonList(tnode1);

  }
}
