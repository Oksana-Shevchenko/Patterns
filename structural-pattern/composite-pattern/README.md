```Composite``` is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

Composite became a pretty popular solution for the most problems that require building a tree structure. Composite’s great feature is the ability to run methods recursively over the whole tree structure and sum up the results.

```Usage examples```: The Composite pattern is pretty common in Java code. It’s often used to represent hierarchies of user interface components or the code that works with graphs.

Here are some composite examples from standard Java libraries:

```java.awt.Container#add(Component)``` (practically all over Swing components)

```javax.faces.component.UIComponent#getChildren()``` (practically all over JSF UI components)

```Identification```: The composite is easy to recognize by behavioral methods taking an instance of the same abstract/interface type into a tree structure.