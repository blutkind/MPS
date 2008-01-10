package jetbrains.mps.generator.template;

import jetbrains.mps.smodel.SNode;

public class MapSrcMacro_ParameterObject {
  private SNode myNode;
  private SNode myParentOutputNode;
  private ITemplateGenerator myGenerator;

  public MapSrcMacro_ParameterObject(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    myNode = node;
    myParentOutputNode = parentOutputNode;
    myGenerator = generator;
  }

  public SNode getNode() {
    return myNode;
  }

  public SNode getParentOutputNode() {
    return myParentOutputNode;
  }

  public ITemplateGenerator getGenerator() {
    return myGenerator;
  }
}
