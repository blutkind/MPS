package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Event extends BaseConcept {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.Event";
  public static final String TAXABLE = "taxable";
  public static final String TYPE = "type";
  public static final String POSTING_RULE = "postingRule";

  public Event(SNode node) {
    super(node);
  }

  public Taxable getTaxable() {
    String value = super.getProperty(Event.TAXABLE);
    return Taxable.parseValue(value);
  }

  public void setTaxable(Taxable value) {
    super.setProperty(Event.TAXABLE, value.getValueAsString());
  }

  public EventType getType() {
    return (EventType)this.getReferent(EventType.class, Event.TYPE);
  }

  public void setType(EventType node) {
    super.setReferent(Event.TYPE, node);
  }

  public int getPostingRulesCount() {
    return this.getChildCount(Event.POSTING_RULE);
  }

  public Iterator<PostingRuleTemporalProperty> postingRules() {
    return this.children(PostingRuleTemporalProperty.class, Event.POSTING_RULE);
  }

  public List<PostingRuleTemporalProperty> getPostingRules() {
    return this.getChildren(PostingRuleTemporalProperty.class, Event.POSTING_RULE);
  }

  public void addPostingRule(PostingRuleTemporalProperty node) {
    this.addChild(Event.POSTING_RULE, node);
  }

  public void insertPostingRule(PostingRuleTemporalProperty prev, PostingRuleTemporalProperty node) {
    this.insertChild(prev, Event.POSTING_RULE, node);
  }


  public static Event newInstance(SModel sm, boolean init) {
    return (Event)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.Event", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Event newInstance(SModel sm) {
    return Event.newInstance(sm, false);
  }

}
