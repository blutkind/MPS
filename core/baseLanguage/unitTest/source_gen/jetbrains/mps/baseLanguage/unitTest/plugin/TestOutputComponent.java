package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import javax.swing.JComponent;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.execution.process.ProcessOutputTypes;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.NotNull;
import org.apache.commons.lang.StringUtils;
import com.intellij.openapi.util.Disposer;
import com.intellij.execution.ui.ConsoleViewContentType;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.File;
import jetbrains.mps.util.FileUtil;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import com.intellij.util.io.IOUtil;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class TestOutputComponent implements TestView {
  private static final int MAX_SIZE = 10000;
  private static Logger LOG = Logger.getLogger(TestOutputComponent.class);

  private final JComponent myComponent;
  private final ConsoleView myConsoleView;
  private final TestOutputComponent.CompositeMessage myRootMessage = new TestOutputComponent.RootMessage();
  private String myFilterClass;
  private String myFilterMethod;
  private final TestRunState myState;

  public TestOutputComponent(Project project, JComponent parentComponent, ConsoleView console, TestRunState state) {
    myConsoleView = console;
    myComponent = myConsoleView.getComponent();
    myState = state;
  }

  public void update() {
    if (myState.getLostClass() != null && myState.getLostMethod() != null) {
      final String method = myState.getLostMethod();
      final String test = myState.getLostClass();
      final String text = "\nError: method '" + method + "' in '" + test + "' was not executed somehow.\n\n";
      final Key key = ProcessOutputTypes.STDERR;
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestOutputComponent.this.appendWithParameters(test, method, text, key);
        }
      });
    } else if (myState.getAvailableText() != null) {
      final String text = myState.getAvailableText();
      final Key key = myState.getKey();
      final String test = myState.getCurrentClass();
      final String method = myState.getCurrentMethod();
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestOutputComponent.this.appendWithParameters(test, method, text, key);
        }
      });
    }
  }

  public void init() {
    this.clear();
  }

  public JComponent getComponent() {
    return myComponent;
  }

  public void filter(String filterClass, String filterMethod) {
    if (neq_r62oz9_a0a0a3_0(filterClass, myFilterClass) || neq_r62oz9_a0a0a3(filterMethod, myFilterMethod)) {
      myFilterClass = filterClass;
      myFilterMethod = filterMethod;
      myConsoleView.clear();
      myRootMessage.print();
    }
  }

  public void appendWithParameters(String testClass, String testMethod, String text, @NotNull Key type) {
    TestOutputComponent.IMessage message = myRootMessage.addMessage(testClass, testMethod, text, type);
    if ((StringUtils.isEmpty(myFilterClass) || eq_r62oz9_a0a0b0e(myFilterClass, testClass))) {
      if ((StringUtils.isEmpty(myFilterMethod) || eq_r62oz9_a0a0a0b0e(myFilterMethod, testMethod))) {
        message.print();
      }
    }
  }

  public void clear() {
    myRootMessage.clear();
    myConsoleView.clear();
  }

  public void dispose() {
    Disposer.dispose(myConsoleView);
  }

  public ConsoleView getConsole() {
    return myConsoleView;
  }

  private static void print(ConsoleView console, Key key, String string) {
    if (ProcessOutputTypes.STDERR.equals(key)) {
      console.print(string, ConsoleViewContentType.ERROR_OUTPUT);
    } else if (ProcessOutputTypes.SYSTEM.equals(key)) {
      console.print(string, ConsoleViewContentType.SYSTEM_OUTPUT);
    } else if (ProcessOutputTypes.STDOUT.equals(key)) {
      console.print(string, ConsoleViewContentType.NORMAL_OUTPUT);
    }
  }

  private static boolean eq_r62oz9_a0a0c3(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_r62oz9_a0a0c4(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean neq_r62oz9_a0a0a3(Object a, Object b) {
    return !((a != null ?
      a.equals(b) :
      a == b
    ));
  }

  private static boolean neq_r62oz9_a0a0a3_0(Object a, Object b) {
    return !((a != null ?
      a.equals(b) :
      a == b
    ));
  }

  private static boolean eq_r62oz9_a0a0a0b0e(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_r62oz9_a0a0b0e(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static interface IMessage {
    public void print();
  }

  public abstract class CompositeMessage implements TestOutputComponent.IMessage {
    protected final List<TestOutputComponent.IMessage> myChildren = ListSequence.fromList(new ArrayList<TestOutputComponent.IMessage>());
    protected int myNextFlush = 0;
    private int myCachedSize = -1;

    public CompositeMessage() {
    }

    public void print() {
      if (matches(myFilterClass, myFilterMethod)) {
        for (TestOutputComponent.IMessage message : ListSequence.fromList(myChildren)) {
          message.print();
        }
      }
    }

    public TestOutputComponent.IMessage addMessage(String testClass, String testMethod, String text, Key key) {
      myCachedSize = -1;
      if (ListSequence.fromList(myChildren).isNotEmpty() && ListSequence.fromList(myChildren).last() instanceof TestOutputComponent.CompositeMessage) {
        TestOutputComponent.CompositeMessage message = (TestOutputComponent.CompositeMessage) ListSequence.fromList(myChildren).last();
        if (message.merges(testClass, testMethod)) {
          return message.addMessage(testClass, testMethod, text, key);
        }
      }
      TestOutputComponent.IMessage message = createChildMessage(testClass, testMethod, text, key);
      ListSequence.fromList(myChildren).addElement(message);
      return message;
    }

    public abstract TestOutputComponent.IMessage createChildMessage(String testClass, String testMethod, String text, Key key);

    public boolean matches(String testClass, String testMethod) {
      return true;
    }

    public boolean merges(String testClass, String testMethod) {
      return false;
    }

    public void clear() {
      ListSequence.fromList(myChildren).clear();
      myCachedSize = -1;
    }

    public void flush() {
      TestOutputComponent.CompositeMessage nextFlush = (TestOutputComponent.CompositeMessage) ListSequence.fromList(myChildren).getElement(myNextFlush);
      while (!(nextFlush.canFlush())) {
        myNextFlush++;
        nextFlush = (TestOutputComponent.CompositeMessage) ListSequence.fromList(myChildren).getElement(myNextFlush);
      }
      nextFlush.flush();
      myCachedSize = -1;
    }

    public boolean canFlush() {
      for (TestOutputComponent.IMessage child : ListSequence.fromList(myChildren)) {
        if (child instanceof TestOutputComponent.CompositeMessage) {
          if (((TestOutputComponent.CompositeMessage) child).canFlush()) {
            return true;
          }
        } else {
          return true;
        }
      }
      return false;
    }

    public int size() {
      if (myCachedSize < 0) {
        myCachedSize = ListSequence.fromList(myChildren).foldLeft(0, new ILeftCombinator<TestOutputComponent.IMessage, Integer>() {
          public Integer combine(Integer s, TestOutputComponent.IMessage it) {
            return ((it instanceof TestOutputComponent.CompositeMessage) ?
              s + ((TestOutputComponent.CompositeMessage) it).size() :
              s + 1
            );
          }
        });
      }
      return myCachedSize;
    }
  }

  public class RootMessage extends TestOutputComponent.CompositeMessage {
    public RootMessage() {
    }

    public TestOutputComponent.IMessage createChildMessage(String testClass, String testMethod, String text, Key key) {
      TestOutputComponent.ClassMessage message = new TestOutputComponent.ClassMessage(testClass);
      message.addMessage(testClass, testMethod, text, key);
      return message;
    }

    @Override
    public TestOutputComponent.IMessage addMessage(String testClass, String testMethod, String text, Key key) {
      TestOutputComponent.IMessage message = super.addMessage(testClass, testMethod, text, key);
      if (size() > TestOutputComponent.MAX_SIZE) {
        flush();
      }
      return message;
    }
  }

  public class ClassMessage extends TestOutputComponent.CompositeMessage implements TestOutputComponent.IMessage {
    private final String myClassName;

    public ClassMessage(String className) {
      myClassName = className;
    }

    @Override
    public boolean matches(String testClass, String testMethod) {
      return StringUtils.isEmpty(testClass) || merges(testClass, testMethod);
    }

    public TestOutputComponent.IMessage createChildMessage(String testClass, String testMethod, String text, Key key) {
      TestOutputComponent.MethodMessage message = new TestOutputComponent.MethodMessage(testMethod);
      message.addMessage(testClass, testMethod, text, key);
      return message;
    }

    @Override
    public boolean merges(String testClass, String testMethod) {
      return eq_r62oz9_a0a0c3(myClassName, testClass);
    }
  }

  public class MethodMessage extends TestOutputComponent.CompositeMessage implements TestOutputComponent.IMessage {
    private final String myMethod;
    private File myFile = null;

    public MethodMessage(String method) {
      myMethod = method;
    }

    @Override
    public boolean matches(String testClass, String testMethod) {
      return StringUtils.isEmpty(testMethod) || merges(testClass, testMethod);
    }

    public TestOutputComponent.IMessage createChildMessage(String testClass, String testMethod, String text, Key key) {
      return new TestOutputComponent.TestMessage(text, key);
    }

    @Override
    public boolean merges(String testClass, String testMethod) {
      return eq_r62oz9_a0a0c4(testMethod, myMethod);
    }

    @Override
    public int size() {
      return ListSequence.fromList(myChildren).count();
    }

    @Override
    public void flush() {
      if (myFile == null) {
        myFile = FileUtil.createTmpFile();
        myFile.deleteOnExit();
      }
      DataOutputStream stream = null;
      try {
        stream = new DataOutputStream(new FileOutputStream(myFile, true));
        for (TestOutputComponent.IMessage child : ListSequence.fromList(myChildren)) {
          TestOutputComponent.TestMessage message = ((TestOutputComponent.TestMessage) child);
          String key = message.myKey.toString();
          String text = message.myText;
          IOUtil.writeString(key + text, stream);
        }
        stream.flush();
        ListSequence.fromList(myChildren).clear();
      } catch (IOException e) {
        LOG.error("Cant write messages for " + myMethod, e);
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ignore) {
          }
        }
      }
    }

    @Override
    public void print() {
      if (matches(myFilterClass, myFilterMethod)) {
        if (myFile != null) {
          DataInputStream stream = null;
          try {
            stream = new DataInputStream(new FileInputStream(myFile));
            while (stream.available() > 0) {
              final String line = IOUtil.readString(stream);
              if (line == null) {
                break;
              }
              Key contentType = ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Key>(), ProcessOutputTypes.STDERR, ProcessOutputTypes.SYSTEM, ProcessOutputTypes.STDOUT)).findFirst(new IWhereFilter<Key>() {
                public boolean accept(Key it) {
                  return line.startsWith(it.toString());
                }
              });
              if (contentType != null) {
                TestOutputComponent.print(myConsoleView, contentType, line.substring(contentType.toString().length()));
              } else {
                TestOutputComponent.print(myConsoleView, ProcessOutputTypes.SYSTEM, "Could not parse line:\n" + line + "\n");
              }
            }

          } catch (IOException e) {
            LOG.error("Cant read messages for test " + myMethod, e);
          } finally {
            if (stream != null) {
              try {
                stream.close();
              } catch (IOException ignore) {
              }
            }
          }
        }

        super.print();
      }
    }
  }

  public class TestMessage implements TestOutputComponent.IMessage {
    private final String myText;
    private final Key myKey;

    public TestMessage(String text, @NotNull Key key) {
      myText = text;
      myKey = key;
    }

    public void print() {
      TestOutputComponent.print(myConsoleView, myKey, myText);
    }
  }
}
