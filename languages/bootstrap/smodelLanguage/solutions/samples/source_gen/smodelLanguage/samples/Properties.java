package smodelLanguage.samples;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class Properties {

  public void stringProperty(SNode clazz) {
    boolean hasName = SPropertyOperations.getString(clazz, "name") != null;
    String name = SPropertyOperations.getString(clazz, "name");
    String text = "Name is " + SPropertyOperations.getString(clazz, "name");
    SPropertyOperations.set(clazz, "name", "Sample");
    boolean ok_not_safely = SPropertyOperations.getString(clazz, "name").equals("Sample");
    boolean ok_safely = SPropertyOperations.hasValue(clazz, "name", "Sample");
    boolean ok_in_java = SPropertyOperations.getString(clazz, "name") == "Sample";
  }
  public void stringProperty2(SNode clazz1, SNode clazz2) {
    SPropertyOperations.set(clazz1, "name", "Sample");
    SPropertyOperations.set(clazz2, "name", SPropertyOperations.getString(clazz1, "name"));
    boolean ok = SPropertyOperations.getString(clazz1, "name") == SPropertyOperations.getString(clazz2, "name");
  }
  public void booleanProperty(SNode boolConst) {
    boolean isTrue = false;
    if(SPropertyOperations.getBoolean(boolConst, "value")) {
      isTrue = true;
    }
    boolean isTrue2 = SPropertyOperations.getBoolean(boolConst, "value");
    boolean isTrue3 = SPropertyOperations.getBoolean(boolConst, "value") && true;
    SPropertyOperations.set(boolConst, "value", "" + (!(SPropertyOperations.getBoolean(boolConst, "value"))));
  }
  public void integerProperty(SNode intConst) {
    int i = SPropertyOperations.getInteger(intConst, "value");
    int i2 = SPropertyOperations.getInteger(intConst, "value") + 10;
    if(SPropertyOperations.getInteger(intConst, "value") > 100) {
      SPropertyOperations.set(intConst, "value", "" + (SPropertyOperations.getInteger(intConst, "value") - 100));
    }
  }
  public void enumProperty_string(SNode link) {
    String s = SPropertyOperations.get(link, "sourceCardinality", "0..1");
    boolean ok1 = SPropertyOperations.get(link, "sourceCardinality", "0..1") == s;
    SPropertyOperations.set(link, "sourceCardinality", "0..n");
    boolean ok2 = SPropertyOperations.hasValue(link, "sourceCardinality", "0..n", "0..1");
  }
  public void enumProperty2_string(SNode link1, SNode link2) {
    if(SPropertyOperations.get(link1, "metaClass", null) != SPropertyOperations.get(link2, "metaClass", null)) {
      SPropertyOperations.set(link1, "metaClass", SPropertyOperations.get(link2, "metaClass", null));
    }
    boolean ok1 = SPropertyOperations.get(link1, "metaClass", null) == SPropertyOperations.get(link2, "metaClass", null);
    if(SPropertyOperations.hasValue(link1, "metaClass", "aggregation", null)) {
      boolean ok2 = SPropertyOperations.hasValue(link2, "metaClass", "aggregation", null);
    }
  }
  public void enumProperty3_integer(SNode cellModel) {
    if(SPropertyOperations.hasValue(cellModel, "attractsFocus", "0", "0")) {
      SPropertyOperations.set(cellModel, "attractsFocus", "2");
    }
  }
}
