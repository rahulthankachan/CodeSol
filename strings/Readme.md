##Strings

###Swap-strings


*  **isalpha()** checks for a character
*  **isupper()** can be used to check upper case
*  **islower()** can ber used to check lower case
*  **lower()** can be used to convert to lower case
*  **upper()** can be used to convert to upper case


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












