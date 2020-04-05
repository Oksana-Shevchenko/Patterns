```Facade``` is a structural design pattern that provides a simplified (but limited) interface to a complex system of classes, library or framework.

While Facade decreases the overall complexity of the application, it also helps to move unwanted dependencies to one place.

```Usage examples```: The Facade pattern is commonly used in apps written in Java. It’s especially handy when working with complex libraries and APIs.

Here are some Facade examples in core Java libs:

```javax.faces.context.FacesContext``` uses ```LifeCycle, ViewHandler, NavigationHandler``` classes under the hood, but most clients aren’t aware of that.

```javax.faces.context.ExternalContext``` uses ```ServletContext, HttpSession, HttpServletRequest, HttpServletResponse``` and others inside.

```Identification```: Facade can be recognized in a class that has a simple interface, but delegates most of the work to other classes. Usually, facades manage full life cycle of objects they use.