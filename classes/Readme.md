## This section is for Python Classes


*  **pass** can be used in cases where there is empty definition


####--init--
It is called after the reference for the class object is created. Therefore, it is not exactly a constructor

NOTE: The first argument of every class method, including the __init__() method, is always a reference to the current instance of the class.

#####AND BY CONVENTION IT IS CALLED SELF

#### --class--
It's a function available in each of the python classes. It is used for the meta data information

###Instance variables

````
class Fib:
    def __init__(self, max):
        self.max = max 

````
What is self.max? It’s an instance variable. It is completely separate from max, which was passed into the __init__() method as an argument. self.max is “global” to the instance. That means that you can access it from other methods.

###Instance variables are specific to one instance of a class.


###Member Variables
These are variables that are available to all the instance variables of a class.

**Also, within member function also member variable are accessed via self**


###Deletion
Deleting a key in a dictiona can be done in the following way

````
my_dict.pop("key", None)
or

try:
	del my_dict['key']
except KeyError:
	pass
	
if 'key' in myDict:
    del myDict['key']
	

````

###Inheritance

Syntax for inheritance

````
class Fruit:
	pass

class Tropical_Fruit(Fruit):
	pass

````

###Function override

We can override base class methods. So as a programmer we dont have to worry about the complexity or the type of object. We will see what is authorized automatically.

Plus, we don't have to make more functions.


###Access Super
We can access the super class with the **super()** method

**super(DERIVED CLASS NAME, self)** .method()
Can be used to access the parent methods


###--radd()-- method

**Sum()** method can be used to add different objects also.
Now, how it does that is that it takes the first element and then adds that to 0

0 + element

**Now 0 does not know how to add to an element
But, the element can know how to add to a 0!! Cool ya!**

But, before failing it will also try the x+y -> y+x Cummulative property

And for this we use the reverse adder method

```
__radd(self,other)
return self.number + other 

```

And then the Sum() function will give the solution

But the problem is Book + Book this will not work as one time anyone of them will be in-front 

###--add()-- method
Therefore, we have to override the add method to take care of this case


###isinstance(other, Book)
**NOTE** OTHER IS IN THE BEGINING 

Can be used to check if this is an instance of the Book Class


###--ge--()
````

def __ge__(self, other):
    if isinstance(other, Book):
        return self.pages >= other.pages
    elif isinstance(other, (int, float)):
        return self.pages >= othe



````

###--int---()
Called when the object is converted to an integer

###--isadd--()
Calledd when += is called

###--issub__()
Called when -= is called


A good reference [operator overloading](http://blog.teamtreehouse.com/operator-overloading-python)


Others Include:

*  **--mul--()** is used for multiplication
*  **--div--()** is used for division
*  **--abs--()** is used for absolute overloading




###Classes

In object-oriented programming the focus is on the creation of objects which contain both data and functionality together

A natural way to represent a **point** in Python is with two numeric values. The question, then, is how to group these two values into a compound object

**An alternative is to define a new user-defined compound type, also called a class.**

IMP:

To put a variable in **all the points** we use a member variable- That is all MUST have PERIOD


NOTE: seconds = self.convert_to_sec() + other.convert_to_sec() Line


`````

class Time(object):
    def __init__(self, h = 0, m = 0, s = 0):
        self.h = h
        self.m = m
        self.s = s
    def __str__(self):
        return ('%f hrs:%f min:%f sec' %(self.h,self.m,self.s))
    def convert_to_sec(self):
        return self.h*60*60 +self.m*60 + self.s
    def __add__(self, other):
        seconds = self.convert_to_sec() + other.convert_to_sec()
        hours = seconds//3600
        seconds = (seconds - hours*3600)
        min = seconds // 60
        seconds = seconds - min*60
        sec = seconds
        return Time(hours, min, sec)

time1 = Time(1,2,3)
print(time1)
time2 = Time(1,2,3)
print(time2.h)
print(time1+time2)





`````



###Class Declaration

Finally, we can provide a subset of the parameters by naming them explicitly:

```
class Time:
    def __init__(self, hours=0, minutes=0, seconds=0):

>>> current_time = Time(seconds = 30, hours = 9)
>>> current_time.print_time()
>>> 9:0:30

```





###Deck of Cards

`NOTE: DECKOFCARD.PY`

*  There are 52 cards
*  13 cards in each group
*  Each have attribute: **Suit** and **Rank**


We use encoding for mappings

````
Spades   -->  3
Hearts   -->  2
Diamonds -->  1
Clubs    -->  0


````

````
Jack   -->  11
Queen  -->  12
King   -->  13


````



````
class Card(object):
    suites = ['Clubs', 'Diamond', 'Hearts', 'Spades']
    ranks = ['0','Ace', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Joker',
            'Queen', 'King' ]

    def __init__(self, suite = None, rank = None):
        self.suite = suite
        self.rank = rank

    def __str__(self):
        return '('+ self.suites[self.suite]+ ',' + self.ranks[self.rank] +')'


third_heart = Card(2, 3)
print(third_heart)




````


### --cmp--()

*  0 if the values are equal
*  1 if the first is greater
*  -1 if the second is greater


###Random Range(Shuffle)

To shuffle the deck, we will use the randrange function from the **random module**. With two integer arguments, a and b, randrange chooses a random integer in the 
range `a <= x < b.`

`j = random.randrange(i, length)`


###Remove a Card

###IMPORTANT

**self.cards.remove(card)** uses the same --eq-- method to determine the equality

*  This means that one can override the quality method and customize it for example removal of points, or removal or cards based on the rank and suite


###Pop()
Just create a new function to pop the elements

`For a deck of Cards`
def pop(self):
	return self.cards.pop()


###Adding Inheritance:

see how - > where the function goes is decided

` but since it operates on a single deck and (possibly) several hands, it is more natural to put it in Deck.`


###Round Robin distribution


*  Find the length of the **number of players = len(players)**
*  for i in range(0, len):
 		current_player = players[i % len]
 		current_player.distribute_candy()
 		
 		
**IMP**  `In general, it is always legal to use an instance of a subclass in place of an instance of a parent class.`

`````
class Hand(Deck)
    ...
    def __str__(self):
        s = "Hand " + self.name
        if self.is_empty():
            s = s + " is empty\n"
        else:
            s = s + " contains\n"
        return s + Deck.__str__(self)


`````


###ASK THE QUESTION:

`Should I use the same class or should I create a new class and just inherit that class`

**To get the same color, different suite**


````
    suites = ['Clubs', 'Diamond', 'Hearts', 'Spades']
    match = Card(3 - card.suit, card.rank)
    
````


DO NOT REMOVE THE ELEMENTS WHILE TRAVERSING, SIMPLE MAKE ANOTHER COPY WHICH WILL BE USED FOR THE TRAVERSAL


###MOST IMPORTANT

1. Inheritance is always from a more General to a more specific
2. It is OK to send the child object as a SELF to parent function

   	`DECK.__str__(child)`
   	
3. Try to have the member functions in that class which will use its member variables





























 



 
