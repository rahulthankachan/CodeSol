##Implementation

###Math.round()

`if it is .5`
it will round to 1

###Math.min()

###Math.max()


In the sticks problem checking with `length  = 0 is important`

``````
                s.performCut(min);
                //System.out.println(s.length);
                if (s.length >= 0) {
                    total += 1;
                }

``````


###Wrappers problem

Important concept to keep in mind is that `when we get an extra chocolate the we increase the available wrapper count by one also`

``````
            while(wrappers >= reqWrappers) {
                wrappers -= reqWrappers;
                wrappers += 1;
                extraChoc += 1;
                
            }
            

``````


###String

String is not an ARRAY!!

`use the charAt() method`

###Character Class

1. **Character.isLetter()** a-z, A-Z
2. **isLowerCase()**
3. **isWhitespace()**
4. **toUpperCase()**
5. **isUpperCase()**

The above are all static methods on the Character class

