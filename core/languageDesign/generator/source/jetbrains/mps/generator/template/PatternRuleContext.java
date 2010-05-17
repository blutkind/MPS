package jetbrains.mps.generator.template;

import jetbrains.mps.generator.impl.TemplateContext;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;

/**
 * Evgeny Gryaznov, May 17, 2010
 */
public class PatternRuleContext extends BaseMappingRuleContext {
  private IQueryExecutor myExecutor;

  public PatternRuleContext(SNode inputNode, SNode ruleNode, ITemplateGenerator generator, IQueryExecutor executor) {
    super(inputNode, ruleNode, generator);
    myExecutor = executor;
  }

  public void createPatternContext(GeneratedMatchingPattern pattern) {
    myContext = new TemplateContext(pattern, null, getInputNode(), myExecutor);
  }
}
