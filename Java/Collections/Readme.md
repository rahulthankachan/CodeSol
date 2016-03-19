## Collections Frameworks

All of them have been listed in the java.util

###Collections

####List - Collection Type
1. Ordered collection of elements
2. Indexed
3. There is an automatic shifting of the elements


####SET
1. We cannot have duplicate elements
2. there is **NO** indexing



Interfaces

Collection

1. Set
	*  SortedSet
2. List
3. Queue
4. Deque


Map
1. SortedMap

*  Map represents a dictionary or hash based data structures.
*  **Constant time** 
*  If the same key is inserted then the value is updated


`Now we know that we cannot make objects from the interfaces therefore, we have to use an implementation of the interfaces`

####List 
The below will implement the interface of List
*  **ArrayList**
*  **LinkeList**


**ArrayList**

`import java.util.List;`

1. **add()** Can be used to insert the element in the last position
2. **add(pos, value)** Can be used to add the element at the correct postion 
3. **.size()** Can be used to check the current size of the list

Using the iterator function 


```````

		Iterator it = listOfInts.iterator();

		while(it.hasNext()) {
			System.out.println("The values within the iterator is " + it.next());
		}



```````

**To get the element at a particular index**

`listOfInts.get(i);` sends an object.

### If you are going to use the Integer then make sure you declare it

`Integer x = new Integer(HAVE TO PASS)`;



####SET

*  **HashSet**  Based on hashing, no ordering
*  **TreeSet**  Ordering is guaranteed
*  **LinkedHashSet**


####HASHSET

* **REMEMBER:** Ordering is not guaranteed
* **isEmpty()**
* **contains()**
* **remove()**
* **removeAll()**
* **toArray()**
* **size()**
* **keySet()**
* **values()**
* **containsValue()**


``````

import java.util.HashSet;
import java.util.Set;


public class TestPad {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();

		mySet.add("Rahul");
		mySet.add(" is ");
		mySet.add(" my ");
		mySet.add(" name");

		for (String s : mySet) {
			System.out.println(s);
		}

		System.out.println("Does the list have the value Rahul true/false ?" + mySet.contains("Rahul"));
	}
}




``````



####Map

*  **HashMap()**
*  **TreeMap()**
*  **LinkedHashMap()**

`Map <Integer, String> my = new HashMap <Integer, String> ();`

Functions are:

1. **.put()** can be used to add new elements
2. **.get()** can be used to get the element
3. **containsKey()** can be usef to check if the key exists or not
4. **remove(key)**
5. **isEmpty()**


``````



import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


public class TestPad {


	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Rahul", 1);
		myMap.put("R", 2);
		myMap.put("Rahul", 45);

		System.out.println("Does the values has the key Rahul " + myMap.containsKey("Rahul"));
		System.out.println("What is the value at the Key Rahul is " + myMap.get("Rahul"));


	}
}





``````



###Collections class

Uses the Merge sort
`Arrays.toString(array)` Can be used to print an array

*  list.toArray() can be used to convert a list to array
*  **Collections.sort(list)** can be used to sort a list
*  Changes the **SAME** array 


``````

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class TestPad {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(-1);
		myList.add(-2);

		Collections.sort(myList);

		System.out.println("The array elements are \n" + Arrays.toString(myList.toArray()));
	}
}







``````



####To sort a list of Circles then we have to implement the `Comparable <Circle>` class


`public class Circle implements Comparable <Circle>{`

```````

	@Override
	public int compareTo(Circle o) {
		if (this.radius < o.radius) return -1;
		if (this.radius == o.radius) return 0;
		
		return 1;
	}

	@Override
	public String toString() {
		return "Radius" + String.valueOf(this.radius);
	}



```````

###String.valueOf(int)
Can be used to get the String value of the integer

####Comparator

This could be used when we dont have the Access to the Circle implementation

###Collections.sort(lIST)
can be used to sort the list (Merge Sort)

###Collections.reverse(List)

Can be used to reverse the given list.. Remember they work on the List itself!!! **NO NEW IS CREATED**





