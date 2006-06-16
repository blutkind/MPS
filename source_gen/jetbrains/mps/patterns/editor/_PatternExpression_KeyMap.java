package jetbrains.mps.patterns.editor;

/*Generated by MPS 16.06.2006 16:32:40 */


import jetbrains.mps.nodeEditor.EditorCellKeyMap;

public class _PatternExpression_KeyMap extends EditorCellKeyMap {

  public  _PatternExpression_KeyMap() {
    this.setApplicableToEveryModel(false);
    this.putAction("any", "_", Queries.createKeyMapAction_createWildCard(null));
    this.putAction("any", "@", Queries.createKeyMapAction_createAsPattern(null));
    this.putAction("any", "#", Queries.createKeyMapAction_createVariablePattern(null));
    this.putAction("any", "$", Queries.createKeyMapAction_createPropertyVarPattern(null));
    this.putAction("any", "*", Queries.createKeyMapAction_createListPattern(null));
  }
}
