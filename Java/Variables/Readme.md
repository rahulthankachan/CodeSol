## This section is for the Variable section


Variables will have

*  Name
*  **Type**
*  Value

Initially some junnk value will be stored in the variable. Java will give an error


#### Data - Typea

*  Integers
*  Real Numbers
*  Boolean
*  Character
*  String

####**Integers**

Java stores only the **signed** integers. there is unsigned integers notion.

1. **Byte** - 8bits
2. **Short** Byte - 16bits
3. **Int** - 4*byte  = 32bits
4. **long** - 8bytes - 64bits


-128 to 127

####**Real Numbers**

1.  Real  = double = 34.23 - 64bit
2.  Float   =  23.4**F** - 32bit

**Use the double in usual cases**

####Boolean

1. true
2. false


####Character

CHAR DATA **16bit** - Unicode character

1. a = 'a
2. For the characters which are not there in the keyboard we use '\u value' **\u** is important and that is then followed by the unicode character
3. **IT IS A SINGLE CHARACTER**


####Strings

String is not a primitive, above is all the primitive data type**(8)**

String is followed by a DOUBLE QUOTE

String abc = "abc"


####Literals

Variable is a placeholder of data

A literal is a source code representation of a value. Since it need to be stored it will have an **associated data type**

int x = ***123***


####WHERE THIS IS IMPORTANT

**Incase of Integers**

short x = 3(treated as integer literal) .... short can store

int age = 28(integer literal)......no problem

but 

`long astrodistance = 2224234234234234234238828`

will give an error that literal is out of range

to solve thos

**We need to tell Java to treat the literal as a long literal and not an integer literal**



`long astrodistance = 2224234234234234234238828**L**`

The **L** IS IMPORTANT


**Incase of the floating or double variable**

The value of a literal is by default cosidered equal to a double variable

So,

float x = 24.3**F**

double x = 24.2**D** not required


####Important Escape Seq

1. \n -. NEW LINE
2. \r - Carriage return (Windows)
3. \b - Backspace
4. \t - tab s[ace








































