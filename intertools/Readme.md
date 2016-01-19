##InterTools

*  **product()** is equal to nested for loops cross product
*  **combinations** is similar to creating combinations in the lexicographic order
*  **permutations** permutations
*  **combinations_with_replacements** same element can be repeated


```
>>> from itertools import product
>>>
>>> print list(product([1,2,3],repeat = 2))
[(1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)]
>>>
>>> print list(product([1,2,3],[3,4]))
[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
>>>
>>> A = [[1,2,3],[3,4,5]]
>>> print list(product(*A))
[(1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 3), (3, 4), (3, 5)]
>>>
>>> B = [[1,2,3],[3,4,5],[7,8]]
>>> print list(product(*B))
[(1, 3, 7), (1, 3, 8), (1, 4, 7), (1, 4, 8), (1, 5, 7), (1, 5, 8), (2, 3, 7), (2, 3, 8), (2, 4, 7), (2, 4, 8), (2, 5, 7), (2, 5, 8), (3, 3, 7), (3, 3, 8), (3, 4, 7), (3, 4, 8), (3, 5, 7), (3, 5, 8)]


````


This can also be used for formatting

for item in list():
	print(item, end= " ")
	
###Permutations

This will give all the permutations of the iterable and upto the r values specified

permutations(,r)

Also, the values are generated in the lexicographical **ORDER**


`````
>>> from itertools import permutations
>>> print permutations(['1','2','3'])
<itertools.permutations object at 0x02A45210>
>>> 
>>> print list(permutations(['1','2','3']))
[('1', '2', '3'), ('1', '3', '2'), ('2', '1', '3'), ('2', '3', '1'), ('3', '1', '2'), ('3', '2', '1')]
>>> 
>>> print list(permutations(['1','2','3'],2))
[('1', '2'), ('1', '3'), ('2', '1'), ('2', '3'), ('3', '1'), ('3', '2')]
>>>
>>> print list(permutations('abc',3))
[('a', 'b', 'c'), ('a', 'c', 'b'), ('b', 'a', 'c'), ('b', 'c', 'a'), ('c', 'a', 'b'), ('c', 'b', 'a')]


`````

###Combinations 

Combinations can be used to find the combinations of the input and the length can also be specified . The input is printed in the lexicographical method.


###Combinations with Replacements
Combinations with replacements is similar to the the combinations with a twist that the same number can be used many number of times

###GroubBy
Given a string the it groups the occurances of the letters and creates something like 

(a,1) (b, 3)...

To get the value of repetitions we have to use len( list(2nd value) )

###Maximize
*  **product()** can be used to find the maximum in a special series
*  **max()** can be used to assign the max value from a list




