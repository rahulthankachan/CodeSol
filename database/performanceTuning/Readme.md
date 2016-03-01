##Performance Tuning


###Chapter 11

1. For the primary key the index is already created.


Perfomance Tuning

1. Cleint Side - SQL Performance tuning
2. Server side  - DBMS performance tuning

At the raw disc access level. Grouping related data is tablespace

*  Data files automatically expand in prdefined increments is called **extend**.



**DATA Cache**

1. Is a piece of memory where most commonly accessed data is stored
2. Examples Headlines are seen by many people.
3. Sales items in the Amazon.


**SQL Cache or the procedure cache**

1. People do very similar queries
2. Access plan of the query is cached

*  Majority of the performance- tuning activities focus on minimizing I/O operations.

###BASIC DBMS ARCHITECTURE

**LISTENER**

1.  : Queries are listened by the Listener process.

2. Prcessing of the SQL requests to other processes.



**USER**

1. The DBMS creates a user process to manage each of the client session.


**Optimizer**


**Scheduler**


**Lock Manager**


EVALUATED BASED ON MODES:
Query Optimization algorithms are evaluated on basis of:


**Operation Modes (Query optimization)**

1. Automatic Query Optimization: Finds the most cost-effective access path without user intervention.

2. Manual Query Optimization



**Timing**:

Static query Optimization: 

1. When the query is compiled
2. Best for the embedded queries

Dynamic Query optimization


**Type of information**

Statistics based query optimization algorithm

1. Initially needs some data. Based on the access patterns. 
2. **Green Grass path example**


###Query Processing

*  Parsing
*  Execution
*  Fetching


####Parsing

*  Syntax check
*  Decompose and analyze
*  Access plan
*  NOTE: If only the SQL cache does not have the precomputed access Plan then only go for the evaluation for various plans.


####Execution Phase


*  Locks are acquired
*  Execute I/0 operations
*  Getting the data blocks in the data cache


####Fetching Phase

*  DBMS may use temporary table space to sstore tmporary data.
*  Small chunks


##Indexes and Query Optimization

*  Speed
*  Indexes are ordered
*  Key - Ordered set of values that contain the index.
*  Runtime lookup cost is very less
*  Indexes of indexes
*  Indexes are made on the columns


###Data Sparcity

* Low sparcity, then the index might be useless
`example Gender`
* Whereas, the date of birth has a high sparcity.


###Indexing Schemes

Most common Schemes are

####Hash Index - 

*  Takes a string and a number is sent out,
*  Once you get the hash key then we can get the a smaller list to look for the rows
*  Can be used for the names. Which is sent to the hash funtion.


####B-tree index

*  B+ Tree (sparcity) MORE NUMBER OF LEAVES
*  log(n) for any of the data


####Bitmap Special case index
*  shoes and other bits are markes as 0
*  Types
*  Locations of the factories
* **Column can hold small number Of values** MAX UPTO 8
* SHOES
* DIRECTIONS SW, NE



###Optimizer Choices

1. Rule Based Optimizer
Based on the preset rules. Set by an expert
####GOOD FOR HISTORICAL DATA

2. Cost based Optimizer
Statistics
Real world fluctuations are taken care of. 
####DYNAMIC


###Optimizer Hints
A very good example could be when we tell the indexer to look for the ans in the first 10 rows of an index table.


##SQL Performance Tuning - Client end

###Index Selectivity
Calculates the value for the indexes. This can be used to mark the usability of the index.

* Likey an index would be used in the query

Worth creating for

* an indexable column occurs in a WHERE or Having
* an indexable column appears in a GROUP BY by column
* max and min applied to an indexable column
* there id high data sparcity in the indexable column 


###SQL optimization?

1. Never use the NULL comparisons, Indexes are then useless
2. Prefer numerical over the String based
3. Simple literals or columns and not expressions
4. Ordering in the equality AND(= should be in the first) else there will be waste of computation
5. Fails quite often(AND) then put that in first
6. Avoid the NOT operator
7. Always PUT the always true at the `FIRST OF OR`
7. `qt1 = 10 && <10> > qt2 and not qt1 > qt2`


















 


















































































