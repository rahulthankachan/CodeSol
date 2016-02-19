##Abstraction

**Interfaces and abstract**

The What Part of the methods is **SAME** the **HOW** part of the methods is different.

1. Not allowed to create objects from an interface
2. The keyword to be used for overriding is **"Override"**
3. ABSTRACT METHODS can also be defined inside a class **BUT** if done then the class has to be defined as abstract also.


`NOTE` Abstarct class method is almost same to the iterface method

1. We have to use the abstract keyword in the class definition
2. We have to use the extends keyword instead of the implements keyword.

Difference between the Abstrat classes and the Interfaces

* **There no member variables in the Interface** only static variables exists

![Alt text](/Java/Abstraction/img1.png?raw=true "Differences")


###Way to use this

**Abstract class** Object_reference = new **Concrete class**

###Multiple Interface Inheritance

*  Java only allows for single class inheritance
*  **Java allows multiple interface inheritance**
*  A interface may ***EXTEND*** from another interface
*  So the child of second should provide the implementation for both the methods.

````
public interface B ectends A {

}
````


**NOTE**

`If class implements an interface then if that class does not show the implementation then to exist it must itself become as an abstract class`



###Polymorphism

*  Static Polymorphism - Method overloading
*  Dynamic polymorphism -  Inheritance must come in the picture (Type)
*  Polymorphism comes from dynamic binding (Objects implementation are bound at the runtime)
*  **instanceof** can be used in casr to check the object reference type... Always the ans is a **boolean** `aCat instanceof Cat`
*  After this **Casting can be done to get the methods in the scope**.


VERY IMPORTANT

*  **Polymorphism will happen only with the instance methods and not with the instance variables**








