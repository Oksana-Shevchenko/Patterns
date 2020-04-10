```State``` is a behavioral design pattern that allows an object to change the behavior when its internal state changes.

The pattern extracts state-related behaviors into separate state classes and forces the original object to delegate the work to an instance of these classes, instead of acting on its own.

```Usage examples```: The State pattern is commonly used in Java to convert massive switch-base state machines into the objects.

Here are some examples of the State pattern in core Java libraries:

```javax.faces.lifecycle.LifeCycle#execute()``` (controlled by the FacesServlet: behaviour is dependent on current phase (state) of JSF lifecycle)

```Identification```: State pattern can be recognized by methods that change their behavior depending on the objects’ state, controlled externally.