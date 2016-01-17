##Sets

###Introduction to sets 
A set is an unordered collection of elements without **duplicate** entries.

Use the 

*  **len( set )** function to find the length of the set
*  **sum( set )** function to find the sum of the set


*  **split()** function, if there is no value specified then it takes any space
*  **set.add()** function It adds the element to the set and returns **'None'**.
*  **set.remove()** will remove the element and raise a ***key err*** if not found
*  **set.discard** removes and return None but does not give ***Key Err***
*  **set.pop()** removes and return an **arbitrary element**
*  **set.union(  )** will send a union of the 2 sets
*  **set.intersection()** will give the intersection of the 2
*  **set.difference()** will give A - B
*  **set.symmetric_difference( iterable )** A + B - 2*(A&B)
*  **set.issubset(A)** Can be used to check if it is a subset of A or not- return True/ False


General

*  **enumerate(list)** will return [(1,list[1]), (2,list)....

````

>>> print s.union(enumerate(['R', 'a', 'n', 'k']))
set(['a', 'c', 'r', 'e', (1, 'a'), (2, 'n'), 'H', 'k', (3, 'k'), (0, 'R')])


````


##IMP
###For i in set() is very optimized as compared to 

###For i in list()

Important

````
>>> print s.union({"Rank":1})
set(['a', 'c', 'r', 'e', 'H', 'k', 'Rank'])

###We can use the | operator for set elements also
>>> s | set("Rank")
set(['a', 'R', 'c', 'r', 'e', 'H', 'k', 'n'])

>>> print s.union(enumerate(['R', 'a', 'n', 'k']))
set(['a', 'c', 'r', 'e', (1, 'a'), (2, 'n'), 'H', 'k', (3, 'k'), (0, 'R')])

````
  
###whereas when we use the Hacker as a string in union

````
>>> s = set("Hacker")
>>> print s.union("Rank")
set(['a', 'R', 'c', 'r', 'e', 'H', 'k', 'n'])
 

````


###intersection

set.intersection() will give the intersection
As before the & operator can be used but will only valid for the elements of the sets


###difference

set.difference() will give the intersection
As before the - operator can be used but will only valid for the elements of the sets

###Symmetric difference

The .symmetric_difference() operator returns a set with all the elements that are in the set and the **iterable** but not both.

Uses the ^ operator

###isSubset

set .issubset() or < = is used to check whether a set is a subset of the other

````
Also other solutions

print 'True' if len(A-B)==0 else 'False'

print not bool(A-B)

````


##SET Mutation
If we want to make changes to the original set then we have to use the set mutations

Also NOTE: The operators also work perfectly
*   **.update()** simalar to |=
*   **set.intersetion_update()*** is equal to &=
*   **set.difference_update()** is equal to -=
*   **set.symemetric_difference_update()**  is equal to =^


##Strict Superset

This tool tests whether the set is a proper(strict) superset of the other set like this: **set >= otherSet** and set != otherSet.












