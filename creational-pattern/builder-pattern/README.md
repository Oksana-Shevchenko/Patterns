```Builder``` is a creational design pattern, which allows constructing complex objects step by step.

Unlike other creational patterns, Builder doesn’t require products to have a common interface. That makes it possible to produce different products using the same construction process.

```Usage examples```: The Builder pattern is a well-known pattern in Java world. It’s especially useful when you need to create an object with lots of possible configuration options.

Builder is widely used in Java core libraries:

```java.lang.StringBuilder#append() (unsynchronized)```

```java.lang.StringBuffer#append() (synchronized)```

```java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)```

```javax.swing.GroupLayout.Group#addComponent()```

All implementations ```java.lang.Appendable```

```Identification```: The Builder pattern can be recognized in class, which has a single creation method and several methods to configure the resulting object. Builder methods ofte