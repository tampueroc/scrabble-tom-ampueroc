# Scrabble

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by 
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/), 
and aims purely to be used with the purpose of teaching in the context of the course 
_CC3002 Metodologías de Diseño y programación_ of the 
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the 
_University of Chile_.

---

The first and most important step was to create every Scrabble Type class needed. The needed Scrabble data types were 
Scrabble String (SString), Scrabble Boolean (SBoolean), Scrabble Binary (SBinary), Scrabble Float (SFloat) and 
Scrabble Integer (SInteger). All the methods were declared in the ITypes interface, and directly implemented in the 
abstract class abstractTypes from which every data type was extended from. This allowed the override of common methods
so that every case where two data types were compatible in an operation was accounted for and correctly implemented. 
This was possible by using Double Dispatch, as we override each method that was pertinent to the specific data type 
class in order for it to work. This also allowed us to define incompatible operations so that they return a null value.
We can illustrate this with the following example:

(SFloat object).add(SInteger object) => (SFloat Object).addToFloat(SInteger Object)
=> new SFloat Object with its value computed by operating each Object value.

This was the general gist of how the Scrabble Types and Scrabble Operations where implemented. Afterwards 
the test were handled for each Scrabble Type, testing their constructor methods and individual operations.

The next big step was implementing Factory Classes, which handled the creation of the Scrabble Data Types. By using 
factories we ensure that each object was unique, and everytime we need to create a Scrabble Type object we just need 
to reefer1 to its pertinent Factory Type. Another important characteristic of implementing these pattern is the uniqueness
of each object, as we use a Flyweight approach by having a static dictionary for every Scrabble Type that holds all the 
objects created, so whenever we try to create an object that has already been created before we just retrieve it by 
checking its existence in the dictionary or else, if it's an entirely new object, we create it.

The implementation of an Abstract Syntax Tree was also used. This was archived by creating a general interface INodes
which extends the previous ITypes allowing us to implement our Scrabble Data Types and Operations smoothly. Afterwards 
we defined an abstract class for the two possible nodes that could exist in our tree, nodes that have one child 
(oneNodes) and nodes that have two children (twoNodes). Both node types shared a common method, operate(), which was
declared on the INodes interface and implemented on the abstract class abstractTypes. This was necessary because our
operate method help us retrieve the object itself, getting the Scrabble Type representation of the node.

Finally, we defined every Operation Node, were each can be classified in mainly two categories, as a oneNode or twoNode.
Every transformation node, that basically establishes the transformation of its child to a specific Scrabble Type, was
extended from the oneChild class, and it's operate() method was defined by getting the Scrabble Type representation of 
its child and applying the correct ITypes transformation. Next, the nodes that dealt with twoNodes were mainly the ones 
that worked with Numerical and Logical operations (sparing the negate() operation). These operations needed two nodes to
work, so they are specifically extended from the twoNode class. Each operate() method was overried similarly as
before. Extending the previous example we get:

ASTadd( SFloat Object, SInteger Object) => ASTadd( SFloat Object, SInteger Object).operate() => (SFloat object).add(SInteger object) => (SFloat Object).addToFloat(SInteger Object)
=> new SFloat Object with its value computed by operating each Object value.

This way we use all the previous implementations. Note that the Logical Operation negate() extends from the 
oneNode abstract class, which means that it's operate() method works similarly to all the transformation nodes.

The testing was done for each Factory Type and Node Operand, taking into account their different constructors and methods.

The last part consisted on implementing flow control operations. For this it was needed a rudimentary operation which 
allowed the comparison between two numerical Scrabble Type values. This was archived by implementing the native java
Comparable and a simple double dispatch, so it only operates between Numerical Scrabble Type values. Then this 
comparison operation was added to the AST composite implementation. The next step was creating the necessary classes for 
both the if and while operations in the tree. In order to improve the code extensibility the Visitor design pattern was used,
allowing the easy implementation of new behaviours to the composite structure, with minimal changes to it. The operation of both
flow control operands was finally implemented in the visitor, allowing a specific behavior to be implemented on a specific 
object (if necessary it can also be generalized to different structures in the tree).

The visitor for the While operation used the given Scrabble While Operand and used its given attributes of both condition and
operation to operate the structure indirectly. This same mechanism was used in the if control operand.

It's important to also take note of the implementation of the variables, by using a hash map association a given variable 
name (String) and a given Scrabble Type Object. This was used in order to make dynamic changes to values for the flow control
operands, using specific operations that only works with variables (by reading the variable name in the static hash map, and working
with it's associated value) such as classic numerical operation that updates the first variable in the input and also condition
that were based on comparison nodes that only worked with variables.

Finally this was tested thoroughly with random generated variables and a complex algorithm that involved both if and while operations.
