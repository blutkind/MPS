package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import java.util.Iterator;
import java.util.List;

public interface IMethodCall extends INodeAdapter {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.IMethodCall";
  public static String ACTUAL_ARGUMENT = "actualArgument";
  public static String BASE_METHOD_DECLARATION = "baseMethodDeclaration";

  public int getActualArgumentsCount();

  public Iterator<Expression> actualArguments();

  public List<Expression> getActualArguments();

  public void addActualArgument(Expression node);

  public void insertActualArgument(Expression prev, Expression node);

  public BaseMethodDeclaration getBaseMethodDeclaration();

  public void setBaseMethodDeclaration(BaseMethodDeclaration node);

}
