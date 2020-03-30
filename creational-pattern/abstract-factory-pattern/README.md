```Abstract Factory``` is a creational design pattern, which solves the problem of creating entire product families without specifying their concrete classes.

Abstract Factory defines an interface for creating all distinct products but leaves the actual product creation to concrete factory classes. Each factory type corresponds to a certain product variety.

The client code calls the creation methods of a factory object instead of creating products directly with a constructor call (new operator). Since a factory corresponds to a single product variant, all its products will be compatible.

Client code works with factories and products only through their abstract interfaces. It allows the same client code to work with different products. You just create a new concrete factory class and pass it to the client code.

```Usage examples```: The Abstract Factory pattern is pretty common in Java code. Many frameworks and libraries use it to provide a way to extend and customize their standard components.

Here are some examples from core Java libraries:

```javax.xml.parsers.DocumentBuilderFactory#newInstance()```

```javax.xml.transform.TransformerFactory#newInstance()```

```javax.xml.xpath.XPathFactory#newInstance()```

```Identification```: The pattern is easy to recognize by methods, which return a factory object. Then, the factory is used for creating specific sub-components.