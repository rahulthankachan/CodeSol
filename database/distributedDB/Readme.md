##Distributed DB


###Chapter 12

General types

1. Data can be distributed
2. Processing can be distributed
3. Combination of both


Desirability of distribute DBMS over the centralized DBMS

1. Perfomance Degradation
2. High Costs
3. Reliability problems (earthquakes)
4. Scalability problems
5. Organizational rigidity


Disadvantages

1. Complexity and consistency
2. Technological difficulty, hooking up different kinds of machines
3. `Security`
4. Dubplicates cost
5. Traing people


**Database Fragments**

1. Fragment is a peice of the table

####Distributed Processing

1. Even if the users are in other locations then also it is distributed processing.


###Concurrency control

*  When make changes in one of the copies then all the copies should be changed. (Realted to Replication)
*  **Partitioning** 
*  **Copies**


###Transaction Management

1. All the Reads and Writes should be completed.
2. Then and only then the entire transaction is complete.



###DBMS Components

1. There has to be a `transaction processor`or transaction manager or the application processor.
2. There has to be a **data processor** or the data manager.


###SP/SD

Single Site Procesing / Single Site Data

*  Processing is done on a single system
*  Data is stored on host computers


###Multi Site Processing/ Single Site Data

*  Multiple people can log on but the data is in the single place
*  Many trasaction processor.
*  It is also called the `CLIENT/ SERVER` technology.


###Mp/ MD

3 Flavours

1.  **Homogeneous Database**: Example using the same Oracle servers
2.  **Heterogeneous Databe** OS is the same
3.  **Fully Heterogeneous** When even the OS can change.
4.  Non relational model like network, hierarchical models are also supported apart from the relational database.



###Distributed Database Transparecy features

**Distribution Transparency**

TO hide the specifics

1. : Allows for fragmentation transparency
2.  Location Transparency: We know that it is fragmented but the locations are not known.
3.  Location Mapping Transparency :End user does not know how the fragments are mapped


WE MAKE ALL THIS HAPPE USING THE `DDD(DISTRIBUTED DATA DICTIONARY)`

**2. Trasaction Trasparency**

1. End user does not know that I\O operations are having in the background.


4 Different types of trasations:

1. `REMOTE REQUEST` A single SQL req is for only single databse then it is called the remote request
2. `REMOTE TRASACTION` Request now requires changes in 2 database but in a single site
3. `DISTRIBUTE REQUEST`Different sites
4. `Distribute Trasanction` Update happens on more than one site


###Two - Phase Commit Protocol

1. There is another process calles the coordinator which talks to all the sites.
2. Changes in the data base is done first in the log and then the changes are recorded.
3. If anything fails then the UNDO protocol can be used to go back to an older state



###Write - ahead protocol
Forces the log entry to be written to be first before the actual trasaction takes place.


**Performance Transparenct**

Allows a DDMB to operate as if it were a centralized database.

**Failure Transparency**

Ensures the system will operate in case of a network failaure.

**Replication Transarecy**:

User does not know which replica.



###Distributed Database Design

* Data Fragmentation(shards)
* Data Replication
* Data Allocation



####Data Fragmentation

* Information is stored in the **DDD**

**Horizontal Fragmentation** (State based)
**Vertical fragmentation** (gpa)
**Mixed Fragmentation** Vertical and then the columns fragmentation


####Replication

1. Anything something updates all the other.
2. UPDATE PUSH - Problem that it could slow the system.


####Data Allocation (What goes where)

1. Centralized data allocation There is no replications
2. Partitioned data allocation (fragments are kept at different places)
3. Replicated data allocation (keeping the copies somewhere else)


###The cap Theorm

*  Consistency
*  Availability 
*  Partition tolerance (so many failed but still woking)


###BASE(Basically available, soft state, eventually consistency)


12 commandments from CJ Date

1. Local site independence - each of the local copies are indenpendent of each other.
2. Centralized site independency No centralized update, no waiting for a server
3. Failure independence : Some of the nodes go down then till the other hould work just fine.
4


6  Distributed query independence
7  Distributed transaction



















































