package jetbrains.mps.nodeEditor;

import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.ide.command.CommandUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Sergey Dmitriev.
 * Created Sep 16, 2003
 */
public class NodeSubstituteChooser implements IKeyboardHandler {
  static final int MAX_MENU_LEN = 30;
  static final int SCROLLER_WIDTH = 7;

  private PopupWindow myPopupWindow = null;
  private boolean isChooserActivated = false;
  private boolean isPopupActivated;

  private Point myPatternEditorLocation = new Point(10, 10);
  private Dimension myPatternEditorSize = new Dimension(50, 50);

  private AbstractEditorComponent myEditorComponent;
  private String[] myStrings;
  private NodeSubstitutePatternEditor myPatternEditor;
  private INodeSubstituteInfo myNodeSubstituteInfo;
  private List<INodeSubstituteAction> myMenuSubstituteEntries;
  private boolean myMenuEmpty;

  public NodeSubstituteChooser(AbstractEditorComponent editorComponent) {
    myEditorComponent = editorComponent;
  }

  private PopupWindow getPopupWindow() {
    if(myPopupWindow == null) {
      myPopupWindow = new PopupWindow(getEditorWindow());
    }
    return myPopupWindow;
  }

  private Window getEditorWindow() {
    Component component = myEditorComponent;
    while(!(component instanceof Window)) {
      component = component.getParent();
    }
    return (Window) component;
  }

  public void setLocationRelative(EditorCell cell) {
    Component component = cell.getEditorContext().getNodeEditorComponent();
    Point anchor = component.getLocationOnScreen();
    Point location = new Point(anchor.x + cell.getX(), anchor.y + cell.getY() + cell.getHeight());
    getPopupWindow().setLocation(location);

    myPatternEditorLocation = new Point(anchor.x + cell.getX(), anchor.y + +cell.getY());
    myPatternEditorSize = new Dimension(cell.getWidth() + 1, cell.getHeight());
  }

  public void setNodeSubstituteInfo(INodeSubstituteInfo nodeSubstituteInfo) {
    myNodeSubstituteInfo = nodeSubstituteInfo;
  }

  public void setPatternEditor(NodeSubstitutePatternEditor patternEditor) {
    myPatternEditor = patternEditor;
  }

  protected NodeSubstitutePatternEditor getPatternEditor() {
    if(myPatternEditor == null) {
      myPatternEditor = new NodeSubstitutePatternEditor();
    }
    return myPatternEditor;
  }

  public boolean isVisible() {
    return isChooserActivated;
  }

  public void setVisible(boolean b) {
    if(isChooserActivated != b) {
      if(b) {
        myEditorComponent.pushKeyboardHandler(this);
        getPatternEditor().activate(getEditorWindow(), myPatternEditorLocation, myPatternEditorSize);
        myNodeSubstituteInfo.invalidateActions();
        rebuildMenuEntries();
        getPopupWindow().setSelectionIndex(0);
        getPopupWindow().relayout();
        getPopupWindow().setVisible(true);
        isPopupActivated = true;
      } else {
        getPopupWindow().setVisible(false);
        getPatternEditor().done();
        isPopupActivated = false;
        myEditorComponent.popKeyboardHandler();
      }
    }
    isChooserActivated = b;
  }

  private void rebuildMenuEntries() {
    myMenuEmpty = false;
    String pattern = getPatternEditor().getPattern();
    List<INodeSubstituteAction> matchingActions = myNodeSubstituteInfo.getMatchingActions(pattern);
    myMenuSubstituteEntries = new LinkedList<INodeSubstituteAction>(matchingActions);
    if(myMenuSubstituteEntries.size() == 0) {
      myMenuEmpty = true;
      myMenuSubstituteEntries.add(new AbstractNodeSubstituteAction() {
        public String getName() {
          return "No variants for \"" + getPatternEditor().getPattern() + "\"";
        }

        public SemanticNode doSubstitute(String pattern) {
          return null;
        }
      });
    }

    // cache strings
    myStrings = new String[myMenuSubstituteEntries.size()];
    for(int i = 0; i < myMenuSubstituteEntries.size(); i++) {
      INodeSubstituteAction entry = myMenuSubstituteEntries.get(i);
      myStrings[i] = entry.getName();
    }
  }

  protected String[] getStrings() {
    return myStrings;
  }

  public boolean processKeyReleased(EditorContext editorContext, KeyEvent keyEvent) {
    return false;
  }

  public boolean processKeyPressed(EditorContext editorContext, KeyEvent keyEvent) {

    if(getPatternEditor().processKeyPressed(keyEvent)) {
      if(isPopupActivated) {
        rebuildMenuEntries();
        repaintPopupMenu();
      }
      return true;
    }

    if(keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
      setVisible(false);
      return true;
    }

    if(isPopupActivated) {
      return menu_processKeyPressed(keyEvent);
    }

    if(keyEvent.getKeyCode() == KeyEvent.VK_ENTER || (keyEvent.getKeyCode() == KeyEvent.VK_SPACE && keyEvent.isControlDown())) {
      String pattern = getPatternEditor().getPattern();
      List<INodeSubstituteAction> matchingActions = myNodeSubstituteInfo.getMatchingActions(pattern);
      if(matchingActions.size() == 1) {
        setVisible(false);
        CommandUtil.substituteNode(matchingActions.get(0), pattern, myNodeSubstituteInfo, myEditorComponent.getContext());
      }
      return true;
    }
    return false;
  }

  private boolean menu_processKeyPressed(KeyEvent keyEvent) {
    String[] strings = getStrings();
    if(strings.length > 0) {
      if(keyEvent.getKeyCode() == KeyEvent.VK_UP) {
        getPopupWindow().setSelectionIndex(getPopupWindow().getSelectionIndex() - 1);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
      if(keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
        getPopupWindow().setSelectionIndex(getPopupWindow().getSelectionIndex() + 1);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
      if(keyEvent.getKeyCode() == KeyEvent.VK_PAGE_UP) {
        getPopupWindow().setSelectionIndex(getPopupWindow().getSelectionIndex() - MAX_MENU_LEN);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
      if(keyEvent.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
        getPopupWindow().setSelectionIndex(getPopupWindow().getSelectionIndex() + MAX_MENU_LEN);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
      if(keyEvent.getKeyCode() == KeyEvent.VK_HOME) {
        getPopupWindow().setSelectionIndex(0);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
      if(keyEvent.getKeyCode() == KeyEvent.VK_END) {
        getPopupWindow().setSelectionIndex(strings.length - 1);
        repaintPopupMenu();
        if(!myMenuEmpty) {
          myPatternEditor.setText(getPopupWindow().getSelectedText());
          myPatternEditor.setCaretPosition(getPopupWindow().getSelectedText().length());
        }
        return true;
      }
    }

    if(keyEvent.getKeyCode() == KeyEvent.VK_ENTER || (keyEvent.getKeyCode() == KeyEvent.VK_SPACE && keyEvent.isControlDown())) {
      if(!myMenuEmpty) {
        String pattern = getPatternEditor().getPattern();
        INodeSubstituteAction entry = myMenuSubstituteEntries.get(myPopupWindow.getSelectionIndex());
        setVisible(false);
        CommandUtil.substituteNode(entry, pattern, myNodeSubstituteInfo, myEditorComponent.getContext());
      }
      return true;
    }
    return false;
  }

  private void repaintPopupMenu() {
    if(isPopupActivated) {
      getPopupWindow().relayout();
      getPopupWindow().repaint();
    }
  }

  private class PopupWindow extends JWindow {
    private int selectionIndex = 0;
    private int firstVisibleIndex = 0;
    private int lastVisibleIndex = 0;

    public PopupWindow(Window owner) {
      super(owner);
    }

    public int getSelectionIndex() {
      return selectionIndex;
    }

    public void setSelectionIndex(int index) {
      if(index < 0) {
        index = 0;
      }
      int fullLength = getStrings().length;
      if(index >= fullLength) {
        index = fullLength - 1;
      }

      selectionIndex = index;
      int listLength = Math.min(MAX_MENU_LEN, fullLength);
      lastVisibleIndex = firstVisibleIndex + (listLength - 1);
      if(index < firstVisibleIndex) {
        firstVisibleIndex = index;
        lastVisibleIndex = firstVisibleIndex + (listLength - 1);
      } else if(index > lastVisibleIndex) {
        lastVisibleIndex = index;
        firstVisibleIndex = lastVisibleIndex - (listLength - 1);
      }
//      System.out.println("setSelection: selected=" + selectionIndex + " first=" + firstVisibleIndex + " last=" + lastVisibleIndex);
    }

    public String getSelectedText() {
      String[] types = getStrings();
      return types[selectionIndex];
    }

    public void relayout() {
      setSelectionIndex(getSelectionIndex());
      String[] types = getStrings();
      int lineHeight = 0;
      int w = getWidth()/* - SCROLLER_WIDTH*/;
      for(int i = 0; i < types.length; i++) {
        String type = types[i];
        TextLine textLine = new TextLine(type, this);
        textLine.relayout();
        lineHeight = textLine.getHeight();
        w = Math.max(w, textLine.getWidth());
      }

      int h = lineHeight * Math.min(MAX_MENU_LEN, types.length);
//      if(firstVisibleIndex > 0) {
//        h += lineHeight;
//      }
//      if(lastVisibleIndex < (types.length - 1)) {
//        h += lineHeight;
//      }
      setSize(w/* + SCROLLER_WIDTH*/, h);
//      System.out.println("relayout : w=" + w + " h=" + h + " line h=" + lineHeight);
    }

    public void paint(Graphics g) {
//      System.out.println("paint: selected=" + selectionIndex + " first=" + firstVisibleIndex + " last=" + lastVisibleIndex);
      String[] types = getStrings();

      Rectangle bounds = g.getClipBounds();
      g.setColor(Color.CYAN);
      g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
      g.setColor(Color.GRAY);
      g.drawRect(bounds.x, bounds.y, bounds.width - 1, bounds.height - 1);

      boolean needScroller = firstVisibleIndex > 0 || lastVisibleIndex < (types.length - 1);
      if(needScroller) {
        int scrollerY = (int) (bounds.y + ((long) firstVisibleIndex * (long) bounds.height) / types.length);
        int scrollerH = (int) (((long) (lastVisibleIndex - firstVisibleIndex + 1) * (long) bounds.height) / types.length);
        Rectangle scrollerBounds = new Rectangle(bounds.x + bounds.width - SCROLLER_WIDTH, scrollerY, SCROLLER_WIDTH, scrollerH);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(scrollerBounds.x, scrollerBounds.y, scrollerBounds.width, scrollerBounds.height);
      }

      int shiftY = 0;
//      if(firstVisibleIndex > 0) {
//        TextLine textLine = createTextLine("   ...   ");
//        textLine.paint(g, 0, shiftY, false, false);
//        shiftY += textLine.getHeight();
//        needScroller = true;
//      }

      for(int i = firstVisibleIndex; i <= lastVisibleIndex; i++) {
        TextLine textLine = createTextLine(types[i]);
        textLine.paint(g, 0, shiftY, i == selectionIndex, false);
        shiftY += textLine.getHeight();
      }

//      if(lastVisibleIndex < (types.length - 1)) {
//        TextLine textLine = createTextLine("   ...   ");
//        textLine.paint(g, 0, shiftY, false, false);
//        needScroller = true;
//      }
    }

    private TextLine createTextLine(String text) {
      TextLine textLine = new TextLine(text, this);
      textLine.setSelectedBackgroundColor(Color.blue);
      textLine.setSelectedTextColor(Color.white);
      textLine.setTextColor(Color.black);
      textLine.setSelectedBorderColor(null);
      textLine.setBorderColor(null);
      textLine.setCaretEnabled(false);
      textLine.relayout();
      return textLine;
    }
  }
}
