**Data definition commands**

*  Create table
*  NOT NULL -columns will not have not null values
*  UNIQUE - Columns will not have duplicate values
*  PRIMARY KEY
*  FOREIGN KEY
*  DEFAULT - Defines the default value(When the value is not entered)
*  CHECK - Validates the data in an attribute
*  CREATE INDEX - Creates an index for the table
*  CREATE TABLE AS - Create a new tabke based on the quesry of the user
*  DROPT TABLE - Delete a table aloing with its data
*  DROP INDEX - delete an index
*  DROP VIEW - permanently delete a view



**Data manipulation Commands**

* INSERT - Insert a row in the Table
* SELECT - Selects one or more attributes from table or views
* WHERE - Restricts the selection of the rows
* GROUP BY - Groups the rows based on one or more attributes
* HAVING - Restricts the selection of grouped rows based on a condition
* ORDER BY - Orders the selected rows based on one or more attributes
* UPDATE - Modify **AN** attribute's value in one or more table's rows
* DELETE - One or more rows from the table
* COMMIT - Permanently saves **data changes**
* ROLLBACK - Restores data to their original values


####Comparison operators

1. =, <, >, <=, >= , <> Used in conditional expressions

####Logical operators

1. AND/OR/NOT Used in conditional expressions

#####SPECIAL Operators - Used in conditional expresssions

1. BETWEEN - Checks whether an attribute value is within a range
2. IS NULL - Checks whether an attribute value is NULL
3. LIKE - Check whether an attribute value matches a **given string pattern**
4. IN - Checks whether the attribute values matches any value in a **VALUE LIST**
5. EXISTS - **Checks whther a subquery returns any rows**
6. DISTINCT - Limits values to unique values


####Aggregate functions
1. COUNT - Returns the number of rows with **NON - NULL** Values for a given column
2. MIN - Returns the minimum attribute value found in the column
3. MAX - Returns the maximum attribute value found in the column
4. SUM - Returns the sum of the attribute values in a column
5. AVG - Returns the average of all the value in a column


####Common SQL DATA TYPES

1. Numberic
	*  NUMBER (L, D)
 	*  NUMBERIC (L, D)
2. Character
	*  CHAR(L)
	*  VARCHAR(L) OR VARCHAR2(L)
3.  DATE
	*  DATE
	

####General Rules
* One line per column
* Use spaces to line up attributes
* TABLE AND ATTRIBUTE NAMES are in Captal
* PRIMARY KEY IS both **NOT NULL** and **UNIQUE**

#### ON UPDATE Cascade/ ON DELETE Cascade

####Create Index

1. CREATE INDEX indexname ON tablename();
2. DROP INDEX indexname;
3. CREATE UNIQUE INDEX EMP_TESTINDEX ON TEST (COL1, COL2 , COL3)


####UPDATE

**Syntax**

UPDATE tablename SET colum1 = vale WHERE clause



####COMMIT [WORK ]


####DELETE FROM \<Table Name\> where

####Inserting from Another Table

INSERT INTO tableaname SELECT columns FROM tablename

In this the Select query is treated as a subquery


####SELECT FROM tableName WHERE


#####Comparison Operators

*  Can be used on Dates
*  Can be used on Characters
*  <> Not equal to, = equal 

Arithmetic

+, -, *, /, ^ (**)


####LIKE

1. _ - Is used for a single character substitution
2. Within single quotes ''


####CASES

 "Find all vendors such that there exists records for them in the PRODUCT TABLE (via V_CODE) where P_QOH<=P_MIN
 
 
####ADVANCED DDF COMMANDS

1. ALTER TABLE : Makes changes to the table structure
2. Keywords - ADD, MODIFY, DROP
3. Can be Used to ** Add ** or **remove** constraints
4. Can be used to alter the data type in a column
5. ALTER TABLE tablename MODIFY (columnname(datatype))


####Copying Parts of the Table

ALTER TABLE PART

ADD FOREIGN KEY (V_CODE) REFERENCES VENDOR;


####ORDER BY
Order By command is helpful when listing the order is helpful

*  ASC, 
*  DESC **ORDER BY <Column Name> DESC**


####DISTINCT

Can be used to find only the unique values

`SELECT DISTICT columnlist FROM tablelist`


####Aggregate Functions 
Act on the numerical data


#####Count
1. COUNT(*) all the values
2. COUNT(COLUMNNAME) all the NON NULL Values only

#####MAX
1. Can only be used in the SELECT statement
2. `We can't do: WHERE P_PRICE = MAX(P_PRICE).`


####GROUB BY
Frequency distribution created by groub by
GroupBy can **only be used** in convert with an aggregate function


####Alias
Identifies the source table

FROM PRODUCT P- This will be the Alias

Can be used in case the join is from the table to itself




###QUICK TIPS

1. Inserting of the rows in the Table then each of the values must be either NULL or have some value in it, We cannot have lesser number of vallues in the INSERT INTO statement.
2. 



























