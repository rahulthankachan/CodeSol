##Strings

###Swap-strings


*  **isalpha()** checks for a character(Only alphabets)
*  **isupper()** can be used to check upper case
*  **islower()** can ber used to check lower case
*  **lower()** can be used to convert to lower case, **NOT SAME**
*  **upper()** can be used to convert to upper case, **NOT SAME**
*  **capitalize()** can be used to change the first as capital, **NOT SAME**


###String Split and Join

*  **join()** is used to join the list 
*  **split()** is used to split the list


###Mutations

The strings are not mutable in nature

Approaches are:

*  Change to list and then make the changes
*  Use the concatenation method

###Find a String

*  String letters are case sensitive

See that i is not changed as it is the iterator:

````
for i in range(0,len(s_input)):
    if i > index
        index = s_input.find(sub_input,i,len(s_input))
        if index != -1:
            count += 1
print count

````

*   **find()** is used to find the index of the first occurance
*   find(sub_string, **first_index**, **last_index**) is used to check between
*   returns **-1** if not found


###String Validators

*  **isalnum()** if all the characters of a string are alphanumeric (a-z, A-Z and 0-9)
*  **isalpha()**  string are alphabetical (a-z and A-Z)
*  **isdigit()** is a digit 0-9
*  **islower()** is in lower case
*  **isupper()** is in upper case

###Text Allignment

There are three functions that can be used

*   **center(width)**
*   **ljust(width)**
*   **rjust(width)**

 
`
The second parameter can be used for specifying the characater that will substitute blank space`

###Text Wrap
This can be used to do the wrapping in a list

textwrap.wrap(string, **8**)


```
import textwrap

textwrap.wrap(string, 8)
['This is', 'a very', 'very', 'very', 'very', 'very', 'long', 'string.'] 

```


This can be used for the filling into a paragraph of **lines** with size  8

`textwrap.fill(string,8)`

###Designer Door Mat

Quick assignment

`N, M = map(int,raw_input().split())`

*  **xrange(start,stop,step)** simalar to the range function

We can use the print **('string'*4)** to output 4 occurances directly


###String formatting

To get the various forms

*  oct(x)[2:]
*  bin()[2:]
*  hex()


###Capitalize 

map() will return the list

```
my_string = raw_input().split(" ")
print (' ').join(map(lambda x: x.capitalize(),my_string))

```

###Alphabet Rangoli

*   xrange(start, stop, iterator)
*   **reversed()** will not return a list
*   so use list(reversed(reverse))
*   another way is list(::-1)

###Minions

*  word.find(sub,start,last)






























