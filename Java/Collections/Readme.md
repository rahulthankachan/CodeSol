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


`listOfInts.get(i);` sends an object.



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


###Collections class

Uses the Merge sort
`Arrays.toString(array)` Can be used to print an array

*  list.toArray() can be used to convert a list to array
*  **Collections.sort(list)** can be used to sort a list
*  Changes the same array 


####To sort a list of Circles then we have to implement the `Comparable` class


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




















