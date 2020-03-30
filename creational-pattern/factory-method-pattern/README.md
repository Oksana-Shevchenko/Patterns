```Factory method``` is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.

Factory Method defines a method, which should be used for creating objects instead of direct constructor call (new operator). Subclasses can override this method to change the class of objects that will be created.

```Usage examples```: The Factory Method pattern is widely used in Java code. It’s very useful when you need to provide a high level of flexibility for your code.

The pattern is present in core Java libraries:

```java.util.Calendar#getInstance()```
```java.util.ResourceBundle#getBundle()```
```java.text.NumberFormat#getInstance()```
```java.nio.charset.Charset#forName()```
```java.net.URLStreamHandlerFactory#createURLStreamHandler(String)```(Returns different singleton objects, depending on a protocol)
```java.util.EnumSet#of()```
```javax.xml.bind.JAXBContext#createMarshaller()``` and other similar methods.

```Identification```: Factory methods can be recognized by creation methods, which create objects from concrete classes, but return them as objects of abstract type or interface.