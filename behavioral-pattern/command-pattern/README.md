```Command``` is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.

Also known as: ```Action```,  ```Transaction```

```Command``` converts requests or simple operations into objects.

The conversion allows deferred or remote execution of commands, storing command history, etc.

```Usage examples```: The Command pattern is pretty common in Java code. Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions. It’s also used for queueing tasks, tracking operations history, etc.

Here are some examples of Commands in core Java libraries:

All implementations of ```java.lang.Runnable```

All implementations of ```javax.swing.Action```

```Identification```: The Command pattern is recognizable by behavioral methods in an abstract/interface type (sender) which invokes a method in an implementation of a different abstract/interface type (receiver) which has been encapsulated by the command implementation during its creation. Command classes are usually limited to specific actions.
