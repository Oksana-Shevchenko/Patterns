```Iterator``` is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

```Usage examples```: The pattern is very common in Java code. Many frameworks and libraries use it to provide a standard way for traversing their collections.

Here are some examples from core Java libraries:

All implementations of ```java.util.Iterator``` (also ```java.util.Scanner```).

All implementations of ```java.util.Enumeration```

```Identification```: Iterator is easy to recognize by the navigation methods (such as next, previous and others). Client code that uses iterators might not have direct access to the collection being traversed.