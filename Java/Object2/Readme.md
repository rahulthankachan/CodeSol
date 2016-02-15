## Objects 2

###Method Overloading

*  **Method Signature** consists of the name of the methods and the attributes pased to the method
*  `Method sginature does not include the return type in Java`
*  2 methods with the same method signature cannot be part of the same class in Java. **(Also if return type is different : STILL WILL BE INVALID)**
*  This is also called **static polymorphism**


###Constructors

For member variables the default values are set. `Boolean is set to false`
Whereas, in case of the variables which are declared within the function itself. **Java mandates them to be initialized before they can be used**

1. For character is the null charater and it is \u0000
2. For the objects it is set to NULL
3. If a constructor is creaed then the default constructor will be not used. Also if there is a constructor with ateast one argument then the default contructor without any arguments is also **NOT AVAILABLE**
4. Therefore the implicit constructor is **NOT AVAILABLE**


````
public class Circle {

	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this(1);   /////////THIS IS COOL
	}

	public double getRadius() {
		return radius;
	}
}


````


###Pass By Value

*  In Java all the variables are passed **by Value** ONLY.
*  So even the swapping for object references will not work in Java
*  So even in the case of the objects, The object a copy of object references is passed which is lost out of scope when the swapper comes out.
*  So for correct `swapping send only the parent object which has variable as member variables`


````

public class TestPad {
	public Circle c1;
	public Circle c2;
	
	TestPad myTest = new TestPad();
		myTest.c1 = c1;
		myTest.c2 = c2;
		
	myTest.truSwapper();
	
	NOTE THAT C1 AND C2 WILL REMAIN THE SAME, BUT 
	testPad.c1 and TestPad.c2 will be swapped.


	public void truSwapper(){
		Circle temp = this.c1;
		this.c1 = this.c2;
		this.c2 = temp;

	}


`````

###Static

Static members are those members which are associated with the class and **not** with the objects or instances.

`As a convention we should try to always access the static methods and variable usig the name of the class and not using the instance reference variable`

Though the instance variable is NULL still it can be used to access the static variable. But accessing the instance member variables will give a Null pointer exception.

``````
public class TestPad {

	public static void main(String[] args) {

		MathUtil m = null;
		System.out.println("The declared value of PI is " + m.PI);
		m.printPi();   //// This is not the RIGHT Approach
		System.out.println("This is the correct way to access " + MathUtil.PI);

	}
}


class MathUtil {

	public static final double PI = 3.14;

	public static void printPi() {
		double ans = 22.0/7.0;
		System.out.println(ans);
	}
}



``````


###Wrapper Classes

Java provides wrapper classes for all the primitive data types

**Advantages**

1. Allows to use the Static functions example Integer.parseInt("String")
2. Also allows us to use these integers in collections which only allow objects.

To get the original Value:

We `use x.intValue()`



###Autoboxing

Boxing and De-Boxing is automatically done by Java.

`example Integer x = 1(Primitive literal)`

x should have an object reference. This is automaticall done by java.

Similarly z = (x + y), where z is auto -deboxing















