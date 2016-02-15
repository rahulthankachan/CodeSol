## Packages



###Advantages of using Packages

*  Help in prganization of similar classes
*  They help in the naming conflicts
*  They help in the access modifiers


###Naming convention

*  All **lower** case
*  Package name is the reversed domain 
*  In the same company also other team can also com up with the same package name, so therefore use the name of the project in the naming convention also.

At the begining of the class make sure to include the following:
`package <packagename>; `

Other exampple could be `package edu.usc.rahul.geomertry`

*  If the name of the company starts lets say with a number like 123abccompany then in this case start with `_123abccompany s an alternative`
*  Hyphens may not be allowed
*  Also in the case of a 123abc.com also `com._123abc` else we will get an error
*  Also the special charaters like the `int` which is like a keyword we use the following convention `com.int_`


###Package Structure

*  If there is a dot in the Package name then Eclipse will store them as the folders

**NOTE**

`Make sure in the class which is being imported the class acess modifier is set to PUBLIC`


If class not found is ERROR then the following command can be used

`java -cp . geometry.GeometryTest`







