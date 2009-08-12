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
    return new _FunctionTypes._return_P0_E0 <Element>() {

      public Element invoke() {
        Element simpleElement_9152904044274469589 = new Element("person");
        Element simpleElement_9152904044274518018 = new Element("name");
        Text text_7417816926334597241 = new Text(Person.this.getName());
        simpleElement_9152904044274518018.addContent(simpleElement_9152904044274518018);
        Element simpleElement_7417816926334720627 = new Element("lastName");
        Text text_7417816926334720631 = new Text(Person.this.getLastName());
        simpleElement_7417816926334720627.addContent(simpleElement_7417816926334720627);
        Element simpleElement_9152904044274518193 = new Element("address");
        Element elementMacro_7417816926334645014 = Person.this.getAddress().toXml();
        simpleElement_9152904044274518193.addContent(simpleElement_9152904044274518193);
        simpleElement_9152904044274469589.addContent(simpleElement_9152904044274469589);
        return simpleElement_9152904044274469589;
      }
    }.invoke();
  }

}
