```Observer``` is a behavioral design pattern that allows one objects to notify other objects about changes in their state.

The Observer pattern provides a way to subscribe and unsubscribe to and from these events for any object that implements a subscriber interface.

```Usage examples```: The Observer pattern is pretty common in Java code, especially in the GUI components. It provides a way to react to events happening in other objects without coupling to their classes.

Here are some examples of the pattern in core Java libraries:

```java.util.Observer/java.util.Observable``` (rarely used in real world)
All implementations of ```java.util.EventListener``` (practically all over Swing components)
```javax.servlet.http.HttpSessionBindingListener```
```javax.servlet.http.HttpSessionAttributeListener```
```javax.faces.event.PhaseListener```

```Identification```: The pattern can be recognized by subscription methods, that store objects in a list and by calls to the update method issued to objects in that list.