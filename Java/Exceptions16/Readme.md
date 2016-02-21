##Exceptions

*  **Arithmetic exception**

`````
	public double divideBy(int denominator) {
		return 5/denominator;
	}


`````

*  This was giving the **ArithmeticException in case of integer division** and Infinity in case od double division

`````
		try {
		return 5/denominator;
	} catch (ArithmeticException e) {
		System.out.println("Division by 0 is not allowed");
		return -1;

	}

............................
Division by 0 is not allowed
The value after dividing 5 by 0 is -1.0

`````

*  There are mainly 2 hierarchy 
    *  **Object > Throwable > Exceptions > Runtime Exceptions**
    *  Object > Throwable > Error (Program cannot mostly recover from this state)

*  If a method throws an Exception object then the method signature should include that information
*  **IMPORTANT THE SYNTAX** `throw new RuntimeException("Message")`
*  Also if it is a runtime exception then there is no need for us to handle the exception
*  Else, if the exception of type Exception is thrown then it is mandatory for use to handle that
*  This can be done in 2 ways(**because the method sig of invoked function throws an exception**) >
*  Invoke the try catch block in the initiating function or else its wrapper method include throws Exception in the method signature.


**else, we get error**

```````
within 

TestPad.java:30: error: unreported exception Exception; must be caught or declared to be thrown
		if (input > 5) throw new Exception("This is greater NOT ALLOWED!");
		
outside

TestPad.java:11: error: unreported exception Exception; must be caught or declared to be thrown
		demo.lessthan5(denominator);

```````

### e.printStackTrace(); 
Can be used to print the entire stack trace.

`Problem with the checked Exceptions`

``````

		try {
			demo.lessthan5(denominator);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		



``````


Will **NOT** print anything in the logs and it will very difficult to debug

**RUNTME EXCEPTION NEED NOT BE HANDLED**


### Custom Exceptions

*  All the exception that are inherited from the Exception class are considered **CHECKED**
*  All the exceptions that are inherited from the RuntimeException class are considere **UNCHECKED**


``````

	public int divide5By(int denominator)  throws MyRuntimeException{

		try {
			return 5/denominator;

		} catch (ArithmeticException e) {
			throw new MyRuntimeException("Cannot divide by 0!");
		}

	}

	public void lessthan5(int input) throws CustomException {
		if (input > 5) throw new CustomException("The value is too big!!");
	}



``````


ALSO IF YOU USE

````
		try{

			ex.isGreaterThan(Integer.parseInt(args[0]));
		} catch (RuntimeException e) {
			///e.printStackTrace();
		}


>>>>>>>>>>>>>>
Output is nothing

````


###finally { }

Anything within the **finally** will always be executed

*  This could be used in the case like where you want to close a file irrespective of the fact whether you got an error or not.
*  To release memory




