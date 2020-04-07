```Template Method``` is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

```Usage examples```: The Template Method pattern is quite common in Java frameworks. Developers often use it to provide framework users with a simple means of extending standard functionality using inheritance.

Here are some examples of Template Methods in core Java libraries:

All non-abstract methods of ```java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer```.

All non-abstract methods of ```java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap```.

```javax.servlet.http.HttpServlet```, all the ```doXXX()``` methods by default send a HTTP 405 “Method Not Allowed” error as a response. You’re free to override any of them.

```Identification```: Template Method can be recognized by behavioral methods that already have a “default” behavior defined by the base class.