package jetbrains.mps.run.commands.structure;

/*Generated by MPS */

import jetbrains.mps.runConfigurations.structure.StartStatement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StartProcessHandlerStatement extends StartStatement {
  public static final String concept = "jetbrains.mps.run.commands.structure.StartProcessHandlerStatement";
  public static final String PROCESS = "process";

  public StartProcessHandlerStatement(SNode node) {
    super(node);
  }

  public Expression getProcess() {
    return (Expression) this.getChild(Expression.class, StartProcessHandlerStatement.PROCESS);
  }

  public void setProcess(Expression node) {
    super.setChild(StartProcessHandlerStatement.PROCESS, node);
  }

  public static StartProcessHandlerStatement newInstance(SModel sm, boolean init) {
    return (StartProcessHandlerStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.run.commands.structure.StartProcessHandlerStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StartProcessHandlerStatement newInstance(SModel sm) {
    return StartProcessHandlerStatement.newInstance(sm, false);
  }
}
