price >= ANY/ ALL

**Attribute Sub Query** When a select statement has been used in the very beginning. It is more like a calculation.
###The 3 types of the subqueries with the example


###Views
1. Mainly done for security reasons
2. Create VIEW viewname AS SELECT query
3. Updating a view will also update the main database table.


##SEQUENCES

CREATE SEQUENCE sequence_name START WITH Value
NEXTVAL There is a direct ++
CURRVAL There is no direct ++


##PL/SQL
1. Blocks of code - For one time execution
2. Triggers - 
3. Stored Procedures - Stored procedure is block of code which has a name
4. Stored Functions

###EXAMPLE OF THE PROCEDURE 


CREATE OR REPLACE PROCEDURE PRICEDURE_NAME


###Embedded SQL
1. SQLCODE - When the error code is in this the procedural langguage can recover form it.
2. If it is 0 then the code can excute as some of the data would be available

There is more 2 types:
Static
Dynamic SQL


###Anonymous blocks of code





##Normalization

Process of cleaning up of the data is called Normalization.

It is one table at a time.

1. Evaluating and correcting table structure to minimize data **redundancies**
2. Reduces data **anomalies**
3. Proceeds by 1 table at a time
4. Determination

More the higher Normal forms what is hit is the **Performance**


Problems with the curent EMPLOYEE_COMPANY

Anomaly is problem with the data

1. During Insert --- New employee not yet put in a project
2. During Modification --- Some got promoted
3. During Deletion --- Now if the Project has only 1 employee who leaves now




##1NF
1. Table Format, no repeating groups
2. PK Identified, ***Not repeating combination is selected***
3. Fill in the blanks in this step 




##2NF
1. 1NF and no partial dependencies
2. We have a (composite key) Then other attributes should be fully functionally dependent on the composite key and not the partial key alone.
3. a) Make new Table and remove the partial dependencies from the main table 


##3NF
1. 2NF and no transient dependencies
2. Signalling dependency (c->d) becuase it tell about this dependency
3. Promote the non PK to a PK in a new table.

##Boyce Codd Normal Form
1. Every determinant is a candidate key
2. Equal to 2NF when there is only one Candidate Key
3. Vioated only when there are more than one candidate keys


##4NF
1. 3nf an no independent multi-valued dependencies
2. Multi-Valued dependencies
3. SEPARATE!!!


``````
Naming
Give proper code
EMP_NAME Can be split
Extra information can be added
Manager to a project
One can work on a project mutiple times. Assignmnets
Price could be time dependent, snapshot could be stored


SURROGATE KEY


``````





































































