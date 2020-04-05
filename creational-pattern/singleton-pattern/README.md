```Singleton``` is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

Singleton has almost the same pros and cons as global variables. Although they’re super-handy, they break the modularity of your code.

You can just use a class, which depends on Singleton, in some other context. You’ll have to carry the Singleton class as well. Most of the time, this limitation comes up during the creation of unit tests.

```Usage examples```: A lot of developers consider the Singleton pattern an ```antipattern```. That’s why its usage is on the decline in Java code.

Despite this, there are quite a lot of Singleton examples in Java core libraries:

```java.lang.Runtime#getRuntime()```
```java.awt.Desktop#getDesktop()```
```java.lang.System#getSecurityManager()```

```Identification```: Singleton can be recognized by a static creation method, which returns the same cached object.