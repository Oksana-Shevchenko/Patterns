``` Strategy ``` is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

The original object, called context, holds a reference to a strategy object and delegates it executing the behavior. In order to change the way the context performs its work, other objects may replace the currently linked strategy object with another one.

```Usage examples```: The Strategy pattern is very common in Java code. It’s often used in various frameworks to provide users a way to change the behavior of a class without extending it.

Java 8 brought the support of lambda functions, which can serve as simpler alternatives to the Strategy pattern.

Here some examples of Strategy in core Java libraries:

```java.util.Comparator#compare()``` called from ```Collections#sort()```.

```javax.servlet.http.HttpServlet: service()``` method, plus all of the ```doXXX()``` methods that accept HttpServletRequest and HttpServletResponse objects as arguments.

```javax.servlet.Filter#doFilter()```


```Identification```: Strategy pattern can be recognized by a method that lets nested object do the actual work, as well as the setter that allows replacing that object with a different one.

