##Strings

String Literal in Java is ***ALWAYS*** placed in **Double quotes**

*  A string literal is an object and all the string functions are available though the dot operator. `"123".function()`
*  Java string are **immutable** in naure. ***The object cannot be changed it self.***
*  What this means is that the value inside a string variable cannot be changed. **A new object is instead returned**


####str.substring(start_index, end_index)

*  Will return a new object with the substring 
*  Make sure that the substring is in **LOWER case**


####Operations on the String object

*  **+** is the only primitive operator that works on the String objects and then concatenates them
*  **str.length()** will give the length of the string
*  **str.charAt()** will give the character at the position
*  **str.indexOf(int char)** will return the first index or **-1** if **not found**
*  **str.indexOf(string)** will return the first index or **-1** if **not found**
*  **str.indexOf(string, from_index)** will return the first index or **-1** if **not found**
*  The **indexOf** gives the result even when the word is a part of a bigger word also.


###Building HUGE Strings

``````

StringBuilder res = new StringBuilder();
		for (int i = 0; i < 10000; i++) {

			res.append("X");
		}

		long end = System.currentTimeMillis();
		System.out.println("With the builder -> " + (end - start));
		String finalString = res.toString();




``````

**INSTEAD OF**


```````

		String res = "";

		for (int i = 0; i < 10000; i++) {

			res += "X";
		}




```````

####System.currentTimeMillis()
Can be used to get the current time in Millis


####Important

`````

test.evaluateTheArray({1,2,3,4,5});

	public void evaluateTheArray(int[] array) {
		int total = 0;
		for (int x : array) {

			total += x;
		}

		System.out.println("The sum of the array is "+ total);
	}




`````

IS NOT THE CORRECT METHOD AND WILL GIVE AN ERROR

INSTEAD

`test.evaluateTheArray(new int[]{1,2,3,4,5});`



