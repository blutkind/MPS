/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.generator.runtime;

import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.generator.impl.ReductionContext;
import jetbrains.mps.generator.impl.TemplateGenerator;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

import java.util.Collection;
import java.util.Collections;

/**
 * Evgeny Gryaznov, 10/22/10
 */
public class TemplateExecutionEnvironment {

  private final TemplateGenerator generator;
  private final ReductionContext reductionContext;
  private final IOperationContext operationContext;
  private final IGenerationTracer tracer;

  public TemplateExecutionEnvironment(TemplateGenerator generator, ReductionContext reductionContext, IOperationContext operationContext, IGenerationTracer tracer) {
    this.generator = generator;
    this.reductionContext = reductionContext;
    this.operationContext = operationContext;
    this.tracer = tracer;
  }

  public IOperationContext getOperationContext() {
    return operationContext;
  }

  public SModel getOutputModel() {
    return generator.getOutputModel();
  }

  public TemplateGenerator getGenerator() {
    return generator;
  }

  public IGenerationTracer getTracer() {
    return tracer;
  }

  public Collection<SNode> copyNodes(Iterable<SNode> inputNodes, String mappingName) {
    // TODO
    return Collections.emptyList();
  }

  public void nodeCopied(SNode node, SNode outputNode, String templateNodeId) {

  }

  public void resolveInTemplateLater(SNode outputNode, String role, int parentIndex, TemplateContext context) {

  }

  public void resolveInTemplateLater(SNode outputNode, String role, String templateNodeId, TemplateContext context) {

  }

  public void resolve(ReferenceResolver resolver, SNode outputNode, String role, TemplateContext context) {

  }

  /*
   *  returns temporary node
   */
  public SNode insertLater(NodeMapper mapper, PostProcessor postProcessor, TemplateContext context) {
    return null;
  }

  public void postProcess(PostProcessor processor, SNode outputNode, TemplateContext context) {

  }

  public Collection<SNode> processSwitch(TemplateSwitchMapping _switch, TemplateContext context) {
    return null;
  }
}
