package jetbrains.mps.samples.xmlLiterals.sandbox.sandbox;

/*Generated by MPS */

import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jdom.Text;

public class Person {
  private String name;
  private String lastName;
  private Address address;

  public Person() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String newLastName) {
    this.lastName = newLastName;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address newAddress) {
    this.address = newAddress;
  }

  public Element toXml() {
    return new _FunctionTypes._return_P0_E0<Element>() {
      public Element invoke() {
        Element simpleElement_jqm3zu_a0a0g = new Element("person");
        Element simpleElement_jqm3zu_a0a0a0g = new Element("name");
        Text text_jqm3zu_a0a0a0a0g = new Text(Person.this.getName());
        simpleElement_jqm3zu_a0a0a0g.addContent(text_jqm3zu_a0a0a0a0g);
        Element simpleElement_jqm3zu_b0a0a0g = new Element("lastName");
        Text text_jqm3zu_a0b0a0a0g = new Text(Person.this.getLastName());
        simpleElement_jqm3zu_b0a0a0g.addContent(text_jqm3zu_a0b0a0a0g);
        Element simpleElement_jqm3zu_c0a0a0g = new Element("address");
        Element elementMacro_jqm3zu_a0c0a0a0g = Person.this.getAddress().toXml();
        simpleElement_jqm3zu_c0a0a0g.addContent(elementMacro_jqm3zu_a0c0a0a0g);
        simpleElement_jqm3zu_a0a0a0g.addContent(simpleElement_jqm3zu_a0a0a0g);
        simpleElement_jqm3zu_b0a0a0g.addContent(simpleElement_jqm3zu_b0a0a0g);
        simpleElement_jqm3zu_c0a0a0g.addContent(simpleElement_jqm3zu_c0a0a0g);
        return simpleElement_jqm3zu_a0a0g;
      }
    }.invoke();
  }
}
