package jetbrains.mps.run.commands.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProcessBuilderExpression extends Expression {
  public static final String concept = "jetbrains.mps.run.commands.structure.ProcessBuilderExpression";
  public static final String WORKING_DIRECTORY = "workingDirectory";
  public static final String PART = "part";

  public ProcessBuilderExpression(SNode node) {
    super(node);
  }

  public Expression getWorkingDirectory() {
    return (Expression) this.getChild(Expression.class, ProcessBuilderExpression.WORKING_DIRECTORY);
  }

  public void setWorkingDirectory(Expression node) {
    super.setChild(ProcessBuilderExpression.WORKING_DIRECTORY, node);
  }

  public int getPartsCount() {
    return this.getChildCount(ProcessBuilderExpression.PART);
  }

  public Iterator<AbstractProcessBuilderPart> parts() {
    return this.children(AbstractProcessBuilderPart.class, ProcessBuilderExpression.PART);
  }

  public List<AbstractProcessBuilderPart> getParts() {
    return this.getChildren(AbstractProcessBuilderPart.class, ProcessBuilderExpression.PART);
  }

  public void addPart(AbstractProcessBuilderPart node) {
    this.addChild(ProcessBuilderExpression.PART, node);
  }

  public void insertPart(AbstractProcessBuilderPart prev, AbstractProcessBuilderPart node) {
    this.insertChild(prev, ProcessBuilderExpression.PART, node);
  }

  public static ProcessBuilderExpression newInstance(SModel sm, boolean init) {
    return (ProcessBuilderExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.run.commands.structure.ProcessBuilderExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProcessBuilderExpression newInstance(SModel sm) {
    return ProcessBuilderExpression.newInstance(sm, false);
  }
}
