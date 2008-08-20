package jetbrains.mps.ide.findusages.view.optionseditor;

import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.view.optionseditor.options.BaseOptions;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import org.jdom.Element;

import java.util.*;
import java.lang.reflect.InvocationTargetException;

public class FindUsagesOptions implements Cloneable {
  private static Logger LOG = Logger.getLogger(FindUsagesOptions.class);

  private static final String OPTION = "option";
  private static final String CLASS_NAME = "class_name";

  private Map<Class, BaseOptions> myOptions = new LinkedHashMap<Class, BaseOptions>();

  public FindUsagesOptions(Element element, MPSProject project) throws CantLoadSomethingException {
    read(element, project);
  }

  public FindUsagesOptions(BaseOptions... options) {
    for (BaseOptions o : options) {
      myOptions.put(o.getClass(), o);
    }
  }

  public FindUsagesOptions clone() {
    List<BaseOptions> optionsCopy = new ArrayList<BaseOptions>(myOptions.size());
    for (BaseOptions option : myOptions.values()) {
      optionsCopy.add(option.clone());
    }
    return new FindUsagesOptions((BaseOptions[]) optionsCopy.toArray());
  }

  public void setOption(BaseOptions options) {               
    myOptions.put(options.getClass(), options);
  }

  public <T> T getOption(Class<T> optionClass) {
    return (T) myOptions.get(optionClass);
  }

  public void read(Element element, MPSProject project) throws CantLoadSomethingException {
    for (Element optionXML : (List<Element>) element.getChildren(OPTION)) {
      String className = optionXML.getAttribute(CLASS_NAME).getValue();
      try {
        Object o = Class.forName(className).getConstructor(Element.class, MPSProject.class).newInstance(optionXML, project);
        myOptions.put(o.getClass(), (BaseOptions) o);
      } catch (InvocationTargetException e) {
        if (e.getCause() instanceof CantLoadSomethingException) {
          throw (CantLoadSomethingException) e.getCause();
        } else {
          throwLoadException(e, className);
        }
      } catch (ClassNotFoundException e) {
        throwLoadException(e, className);
      } catch (IllegalAccessException e) {
        throwLoadException(e, className);
      } catch (InstantiationException e) {
        throwLoadException(e, className);
      } catch (NoSuchMethodException e) {
        throwLoadException(e, className);
      } catch (Throwable t){
        throwLoadException(t, className);
      }
    }
  }

  private void throwLoadException(Throwable t, String className) throws CantLoadSomethingException {
    LOG.warning("can't instantiate options " + className, t);
    throw new CantLoadSomethingException("can't instantiate options " + className, t);
  }

  public void write(Element element, MPSProject project) throws CantSaveSomethingException {
    for (BaseOptions option : myOptions.values()) {
      Element optionXML = new Element(OPTION);
      optionXML.setAttribute(CLASS_NAME, option.getClass().getName());
      option.write(optionXML, project);
      element.addContent(optionXML);
    }
  }
}
