##Inheritance

Following concepts come under Object oriented programming

1. Inheritance
2. Abstraction
3. Polymorphism
4. Encapsulation
5. Composition


###Inheritance

Important points:

*  **Fields** represent the attribute of the object
*  **Methods** represent the behavious of the object

`````

public class Lion extends Cat {

}


`````

**SUBTYPE IS A SUPERTYPE** VERY IMPORTANT CONCEPT

An interesting feature come out of this

`Cat parent = new Lion()`

is allowed because a Lion will always be of the Cat type

`Also to note here is then we are viewing the Lion object under the glasses of A cat and not a Lion`
**Because of this there is a possibility that some of the methods in Lion will be hidden to us**

*  There is only single class inhertance in Java
*  Each of the classses inherit from the java.lang.Object class



###Method Overriding

1. We should use the **annotations** for the symbol.
2. The annotation is @Override
3. Helps let the compiler know that this is the real intention of the User else we get a warning error from the compiler.
4. Helps the compiler check the method signature and that a method exits which can be overriden else it will give an error.



###Object equality


If we use the following statement

````
Integer i1 = Integer(2)
Integer i2 = Integer(3)

System.out.println(i1==i2)

`````

`The system would print out **FALSE**. In case of java in the equality of the objects their object reference is what is checked.`

*  So in case of the primitive we use the **i1.equals(i2)**
*  To make it work for our custom Object we have to override the equals method


`````

public boolean equals(Object obj) {

if (obj instanceof Integer) {
	return value ==(Integer)obj.intValue();
}

return false;
}


`````

**Also note that the consuctor will not have a return type**

``````

	public Circle(double radius) {
		this.radius = radius;
	}



`````


**A beautiful explanation**

Now when the onbject refernce is of type OBject we see it through the lense of Object and so all the functions are not available

***Therefore, we must typecast it.***



###Final

1. Final can be used to disallow inheritance
2. Final can be used to disallow method overriding
3. Final can be used so that the value in the varibale is not changed


###Overriding

1. We cannot reduce the visibility in a overriden method **We can INCREASE IT**
2. That is if the method have private access in the base class then we can give it default acess or public.
3. But if it have public visibility then we cannot give it a private visibility in the child class



###Protected

*  Is available within a package life default
*  Also available to all the child classes which may be in some other package



###Composition
composition is a has relation with the promitive data types
The ability to make complex data type from primitive data tyoes is called composition


###Encapsulation

Is data hiding
**There is a special stree on making private**

1. There may be several proceses which go in the background which your dont expose and just give a nice interface instead.





























