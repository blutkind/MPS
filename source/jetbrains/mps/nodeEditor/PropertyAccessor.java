package jetbrains.mps.nodeEditor;

import jetbrains.mps.semanticModel.SemanticNode;

/**
 * User: Dmitriev.
 * Date: Jan 16, 2004
 */
public class PropertyAccessor implements ModelAccessor {
  private SemanticNode myNode;
  private String myPropertyName;
  private String myDefaultValue;
  private boolean myWritable;

  public PropertyAccessor(SemanticNode node, String propertyName, String defaultValue, boolean writable) {
    myNode = node;
    myPropertyName = propertyName;
    myDefaultValue = defaultValue;
    myWritable = writable;
  }

  public String getText() {
//    String value = myNode.getProperty(myPropertyName);
//    return value == null ? myDefaultValue : value;
    return myNode.getProperty(myPropertyName);
  }

  public void setText(String text) {
    if(myWritable) {
      myNode.setProperty(myPropertyName, text);
    }
  }
}
