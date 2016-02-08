## Introduction to Java Programming

*  Java will support automatic Garbage collection.
*  All the methods in Java are written inside a class always



###Naming convertions

*  Names of the **classes** and the files start witht the capital letter
*  Names use the camel casing
*  **Digits and ___** ***cant*** be used in the begining of the variables, cane be used in the **middle**
*  Java keywords are not allowed
*  ***No special characters are allowed*** $ and ! is allowed



###Naming of classes

1. Name of the class should be same as java file name.
2. There can only be `one` **public** class within a java file


###Passing value via Command line

`java CopyCat Rahul "is my" name`

The above will have 3 elements in the args array

*  So if there is a double quote then the value is treated as a single UNIT
*  **Also if the Class is not in the current directory then Java will thow an error**
*  Best approach is then to pass the directory as a CLASSPATH
*  If there are multiple directories then the **CLASSPATHS** are added as the ;

`java -cp /Users/rahulthankachan/Documents/Learning-java/ CopyCat "Hey there"
`

###Using the Eclipse IDE

*  Create a new Java project
*  Select a folder structure where all the **classes** `byte code` will be stored. By default all the class names are stores in the bin directory(This will be created by default by Eclipse)
*  Also the **help dialog for the auto complete** can be brought by using **Control + Space**
*  To **pass Arguments** Run > Run configuration > Arguments > Program














