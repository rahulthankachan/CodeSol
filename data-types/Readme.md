##Data-Types

###Lists
Functions that are available

*  append()
*  extend() - Merges another list to the end
*  insert(i,x) 
*  remove(x) - will remove the first occurance 
*  pop() - last element
*  index() - will return the first index
*  count(x) -  count the number of occurances of x
*  sort() 
*  reverse()


There are 3 ways to initialize an array

###tuples
can be used for the keys as they are immutable in nature

the function to be used for this is 
hash()

also for quickly storing in the in format we can use this

`my_tuple = tuple(map(lambda x: int(x), raw_input().split(" ")))`


###Sets
Symettric differences is the the ones which are in either of the sets but do not exist in both of them together

will convert the entire into a integer set ::`list(map(int,list))`

```
myset = {1, 2} # Directly assigning values to a set
myset = set()  # Initializing a set
myset = set(['a', 'b']) # Creating a set from a list
```

functions that are available to sets:

*  add() - if the value is already there then nothing happens 
*  update() - is used  to best fit some nubers in the list
*  discard()-  is used for the removal() alsp remove()-- if not error()
*  union()
*  intersection()
*  difference()

**sorted()** can be used to sort a set it will return a list
also to note that the update funtion can take a set also 

###List Comprehension
Can be used for quick initialization

`[x for x in range(xr+1)]`

###Nested Lists
Lists can be nested. In other words, one list can contain another list.

`a = [['blue', 'green'], ['red', 'black'], ['blue', 'white']]`


a[1][0]

`map(lambda x: print(x),sorted(x))`



