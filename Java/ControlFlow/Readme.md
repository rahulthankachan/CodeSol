##Control Flow in Java


### if (statement)


`Cool Thing`

Integer.parseInt(String) Can be used to grab the integer content from the 

1. Also important thing to note in Java is `if (year % 400 == 0){` complete statement has to be used because `year % 400` **returns an integer** in case of Java
2. Also in case of Java, if no value is returned **then null could be sent**


### Switch ()

*  If any of the value for the case is true then all the statements and cases are evaluated which follow
*  As a result, we have to put a **break** statement after each of the statements


### While loop

*  The expression should be a logic expression --> **TRUE/ FALSE**
*  `while (digits) {` where digits is an int value will give `an ERROR`

###Scanner Class

*  import java.util.Scanner;
*  Scanner scanner = new Scanner(System.in)
*  One can check the buffer with the **Scanner.hasNext()** will send a Boolean value
*  Getting the value can be done using **Scanner.next()**
*  It takes the **System.in** as the attribute for its constructor
*  **STR.equalsIgnoreCase("Value")** will check the STR variable with the value mentioned


**Also Cool Thing**

````
5 3 5

Gives the ouput:
5
4
3
2
1
Print quit to quit or else enter a digit for priting till
3
2
1
Print quit to quit or else enter a digit for priting till
5
4
3
2
1
Print quit to quit or else enter a digit for priting till




````

### Do - While loop

*  Java provides the do-while loop also
*  Ateast once it is executed
*  **MAKE SURE TO PUT THE ; AT THE END OF WHILE**

````

do {

} while(condition);


`````


### Ternary Condition

*  Like all the other flow controls the value in the evaluation should be logical and cannot be an int
*  `5: "True": "False"` is not Correct
*  `int result = (5 > 1) ? 1: 2;` is the correct methodology








	


