#Advanced SQL

It is also possible to join 2 Tables using the **JOIN** keyword

*  Joins condition could be based on other conditons apart from **equality also**. This might inlcude **BETWEEEN, > , < , !=, <>, etc**


###SQL JOIN xpression Styles

* **CROSS JOIN**




`````
SELECT * FROM T1, T2;

SELECT * FROM T1 CROSS JOIN T2;


`````

*  **Inner Join**

(join) Only those rows which match a particular condition
	
`SELECT * FROM T1, T2 WHERE T.NAME = T2.NAME`

(NARURAL JOIN) - Returns only those rows with **matching values in the common columns**

`SELECT * FROM T1 NATURAL JOIN T1`

**(JOIN USING)** - Returns the rows with mathing values in the columns mentioned

`SELECT * FROM T1 JOIN T2 USING(C1)`


``````````
rahulthankachan=# SELECT * FROM EMPLOYEE JOIN LEAVE USING (ID);
 id | name  | manager | days | manager 
----+-------+---------+------+---------
  1 | RAHUL |       2 |    5 |        
  5 | SUME  |       2 |   25 |       3
  2 | RAVI  |       3 |   99 |       3


``````````




**(JOIN ON)** - Retuns all the rows which provide the value in the on clause

`SELECT * FROM T1 JOIN T2 ON T1.C1 = T2.C1`


*  **Outer Join**

(LEFT JOIN) - 

`X LEFT OUT JOIN WILL HAVE ALL THE VALUES FROM THE X OTHER CAN BE NULL`

SELECT * FROM LEAVE LEFT OUTER JOIN EMPLOYEE ON LEAVE.MANAGER = EMPLOYEE.MANAGER;

``````
 id | name  | manager 
----+-------+---------
  1 | RAHUL |       2
  2 | RAVI  |       3
  3 | MAITY |        
  4 | DEEP  |       3
  5 | SUME  |       2
(5 rows)

rahulthankachan=# select * from LEAVE;
 id | days | manager 
----+------+---------
  1 |    5 |        
  5 |   25 |       3
  2 |   99 |       3
  6 |   25 |      35
(4 rows)

rahulthankachan=# SELECT * FROM LEAVE LEFT OUTER JOIN EMPLOYEE ON LEAVE.MANAGER = EMPLOYEE.MANAGER;
 id | days | manager | id | name  | manager 
----+------+---------+----+-------+---------
  5 |   25 |       3 |  2 | RAVI  |       3
  2 |   99 |       3 |  2 | RAVI  |       3
  5 |   25 |       3 |  4 | DEEP  |       3
  2 |   99 |       3 |  4 | DEEP  |       3
  6 |   25 |      35 |    |       |        
  1 |    5 |         |    |       |        
(6 rows)

rahulthankachan=# 



``````

(RIGHT OUTERR JOIN)

`````

rahulthankachan=# SELECT * FROM LEAVE RIGHT OUTER JOIN EMPLOYEE ON LEAVE.MANAGER = EMPLOYEE.MANAGER;
 id | days | manager | id | name  | manager 
----+------+---------+----+-------+---------
    |      |         |  1 | RAHUL |       2
    |      |         |  5 | SUME  |       2
  5 |   25 |       3 |  2 | RAVI  |       3
  2 |   99 |       3 |  2 | RAVI  |       3
  5 |   25 |       3 |  4 | DEEP  |       3
  2 |   99 |       3 |  4 | DEEP  |       3
    |      |         |  3 | MAITY |        
(7 rows)



`````




**(FULL OUTER JOIN ) IS ALSO FULL JOIN**


``````

rahulthankachan=# SELECT * FROM LEAVE FULL OUTER JOIN EMPLOYEE ON LEAVE.MANAGER = EMPLOYEE.MANAGER;
 id | days | manager | id | name  | manager 
----+------+---------+----+-------+---------
    |      |         |  1 | RAHUL |       2
    |      |         |  5 | SUME  |       2
  5 |   25 |       3 |  2 | RAVI  |       3
  2 |   99 |       3 |  2 | RAVI  |       3
  5 |   25 |       3 |  4 | DEEP  |       3
  2 |   99 |       3 |  4 | DEEP  |       3
    |      |         |  3 | MAITY |        
  6 |   25 |      35 |    |       |        
  1 |    5 |         |    |       |        

I

``````


###ADVANCED SUBQUERIES

1. `INSERT INTO PRODUCT SELECT * FROM P`
2. Update based on a Subquery


`````````
UPDATE PRODUCT

SET PRICE = (SELECT AVG(PRICE) FROM FROM PRODUCT)

WHERE
V_CODE = (SLECT V_CODE FROM VENDOR WHERE V_AREACODE = '516')

`````````



**(COMPLEX DELETE)**

````````
DELETE FROM PRODUCT WHERE
V_CODE IN (SELECT V_CODE WHERE V_AREACODE =123)



````````


####IN Attribute
Compares a single value with multiple values.

**Comparrisons which are not equal can USE THE ALL AND THE ANY KEYWORD**

**'= ANY(list of values)' is equivalent to the 'IN'**

###SUBQUERY CREATE A VIRTUAL TABLE WHICH CAN BE USED IN A JOIN(19TH SLIDE)
[THIS](https://dl.dropboxusercontent.com/u/91263185/!shared/courses/CS585/s16/lectures/MoreSQL/slides.html)

***Correlated Quesry() - 25***

1. NEED TO USE ALIASES

````
for{

	for () {
	
	}	
}


````



###SQL QUERY Can therefore appear in either SELECT, FROM , OR WHERE CLAUSE



###Creating a View

`CREATE VIEW viewname as SELECT query`


###Creating a SEQUENCE

`CREATE SEQUENCE INV1 START WITH 2010 NOCACHE`


##procedural

1.  Blocks
2.  Triggers
3.  Stored procedures
4.  Stored Functions

