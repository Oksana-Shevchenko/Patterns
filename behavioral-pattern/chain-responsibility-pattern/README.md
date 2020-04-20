```Chain of Responsibility``` is behavioral design pattern that allows passing request along the chain of potential handlers until one of them handles request.

The pattern allows multiple objects to handle the request without coupling sender class to the concrete classes of the receivers. The chain can be composed dynamically at runtime with any handler that follows a standard handler interface.

```Usage examples```: The Chain of Responsibility pattern isn’t a frequent guest in a Java program since it’s only relevant when code operates with chains of objects.

One of the most popular use cases for the pattern is bubbling events to the parent components in GUI classes. Another notable use case is sequential access filters.

Here are some examples of the pattern in core Java libraries:

```javax.servlet.Filter#doFilter()```

```java.util.logging.Logger#log()```

```Identification```: The pattern is recognizable by behavioral methods of one group of objects indirectly call the same methods in other objects, while all the objects follow the common interface.