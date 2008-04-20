package jetbrains.mps.uiLanguage.runtime.events;

import java.util.HashMap;
import java.util.Map;

public class Event {
  private Map<Object, IListener> myListeners = new HashMap<Object, IListener>();
  private String myName;

  public Event(String name) {
    myName = name;
  }

  public String getName() {
    return myName;
  }

  public void addListener(IListener l, ListenerId id) {
    myListeners.put(id, l);
  }

  public void removeListener(ListenerId id) {
    myListeners.remove(id);
  }

  public void raise(Object o) {
    for (IListener listener : myListeners.values()) {
      listener.invoke(o);
    }
  }
}
