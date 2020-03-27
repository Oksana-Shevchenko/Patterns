```Decorator``` is a Structural design pattern that allows adding new behaviors to objects dynamically by placing them inside special wrapper objects.

Using decorators you can wrap objects countless number of times since both target objects and decorators follow the same interface. The resulting object will get a stacking behavior of all wrappers.

```Usage examples```: The Decorator is pretty standard in Java code, especially in code related to streams.

Here are some examples of Decorator in core Java libraries:

All subclasses of ```java.io.InputStream```, ```OutputStream```, ```Reader``` and ```Writer``` have constructors that accept objects of their own type.

```java.util.Collections```, methods ```checkedXXX()```, ```synchronizedXXX()``` and ```unmodifiableXXX()```.

```javax.servlet.http.HttpServletRequestWrapper``` and ```HttpServletResponseWrapper```

```Identification```: Decorator can be recognized by creation methods or constructor that accept objects of the same class or interface as a current class.