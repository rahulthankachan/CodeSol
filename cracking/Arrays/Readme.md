##Arrays

Implementing and Using a Hash Table

###Importtant component (HASH - MAP)

1. A HashEntry Element to store the **key** and **value**
2. Get element 

``````
 while (map[hash] != null && counter != MAX) {
            HashEntry temp = map[hash];
            if (temp.key == key) {
                return temp.value;
            }
            hash += 1;
            if (hash == MAX) {    /// This can be used to store the elements on top
                hash = 0;
            }
            counter += 1;
        }


``````

Show the result only when `  if (temp.key == key) {`

**NOTE** We keep looping till the time we dont find a **NULL** value


###ArrayLIST (implementation)


####Arrays.copyOfRange()

Copies the specified range of the specified array into a new array

``````
public static byte[] copyOfRange(byte[] original,
                 int from,
                 int to)
`
`````


####Arrays.copyOf(original, NEW_length)

This method will copy the original value into the new one and initialize the rest of the pending elements also. So that the New array has the length of `NEW_LENGTH`



###String Buffer implementaton

1. Maintain an Array of characters which will store all the String characters.
2. By default the length in case of Java is 16
3. ensureCapacity()
4. In the toString Use the **STRING CONSTRUCTOR**

`String(char[], initial , to)`

OR

`String(char[])`



###String

Ascii Character is till `128`
0 - 127

Also if the input is above 128 then the result has to be `false`. There is not need of any computation then.


###Common Mistake

1. Using the <int> in the HashSet
2. Arrays.sort(str) will give you `void return`

### toCharArray() - char[]
can be used to convert a string into its corresponding character Array

###str1.equals(str2)---- > boolean


##IMP;

`int x = char(variable)` is allwed, but the other way is not allowed. **Lossy conversion**

Integer.valueOf() can be used to get the integer value of the string inside


###Learning from the compression problem

1. The letter could be **a 345 b1 c34** so it need not always be `2 size of letter digit`.
2. Sometimes the compression string could be longer
3. Last letter need to be appended again


###String.equals()

1. Is used to check the value
2. If you want to check the object ==

###String condition for rotation

1. Should yx will be a substring of the xyxy.
2. Both the string will have the same length
3. 






















