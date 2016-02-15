## Objects and Classes

###Classes

*  To create a new object use the `object = new Car()`
*  The variable can be represented as `public String name;`
*  Similarly the class methods can be represented as
*  All the objects have ***HAS*** relationship with the instance variables and instance methods

`````

public class Car{

public String nameOfTheModel;

public void getName(){

}


}



`````

`public the the access modifiers`

*  Varaibles can also be declared outside of the methods in a class in JAVA and these are called the **member variables** as they are shared among the members of the class



###Testing

*  **AS A CONVENTION ALL THE TEST CLASSES FOR A CLASS FOLLOW THE NAME OF THE CLASS WITH TEST**
*  



`It is not a good practise to use calculated values in the member variables. example area of a circle can be calculated from its radius (which is the correct member variable)`


###Objects

Circle circle1 = new Circle();

**circle1 is the object reference!!!** and not the object itself

*  Object reference can only be of the same type as they have been declared
*  An object of Triangle class cannot point to a Car object
*  And this is the reason that **Java is called a strongly typed language.**



###Points Example

*  Methods of the **Math class** are static methods 
*  The **Math.sqrt()** can be used to find the square root
*  The **Distance from** is nicely linked to the Point class so that all the methods such as perimeter or the area in the line or Triangle class can make use of it. **Thinking in terms of the objects and their true properties**





