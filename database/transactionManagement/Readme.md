##Transaction Management
###Chapter 10



Is important when the things are changing `FAST`

1. Trasaction is a READ/ WRITE.
2. Insert/ Update/ Delete
3. Trasaction is a cmobination of SELECT, UPDATE, AND INSERT



`Integrity and consistency`

1. Not all the transactions need not always be an update to the database.

##ACID Properties

1. Atomicity -  All operations of a transaction must be completed. If not the trasaction should be aborted
2. Consistency - Consistency is maintained. Good state is persistant.
3. Isolation - Only one trasaction can have access to the cell. Others have to wait.
4. Durability - Ensures that once transactions are commited , they cannot be undone.
5. Serializability - Same resuslts when concurrent trasactions.



###Concurrency Control

###Problems that can happen

1. Lost Update problem
2. Uncommited Data
3. Inconsistent retrievals


NOW Y+10 = 100 HAS THREE STEP!!
1. READ
2. ADD
3. WRITE


###Lost Update Problem

T2 thinks that the current value is only 35 whereas the value is actually 135
T2 HAS TO WAIT!!

###Uncommited Data

1.This is a problem when Rollbacks happens
2. T2 Reads a temporary data.


###Inconsistent Retrieval

1. Update some wrong product


##The scheduler

Establishes the order in which the operations are executed within concurrent transactions.



##METHODS

1. Isolates the data.
2. Pessimistic Locking: Use of locks are based on the assumption that conflict between trasaction will happen.
3. Locking manager: Locks the assest


###Locking

There are 5 levels of locking

1. Database Level locking
2. Table - Level locking
3. Page- level locking, parts os the table are locked
4. Row - level 
5. Field level 


Ways of locking

1. The locks which we saw till now are binary locks.
If an object is locked then everybody has to wait. 0 or 1


2. This is also called exclusive locks.
`Exclusive locks are given in case of writing situations.`

3. `Shared lock`: which are there for reading



`The threelock states are 1. Unlocked 2. Shared(READ), 3. Locked`

###Shared lock

Shared locks are issued when a trasaction wants to Read data, and no exclusive lock is held. (on a data item)

###EXCLUSIVE DATA

Issued when a transaction wants to WRITE data, and **NO** lock is held.

##Two- Phase Locking

###GROWING and Shrinking Phase
Concurrency control, how the transaction acquire and relinquish locks

###LOCKING PHASE
**growing pahse** Transaction acquires all required locks without unlocking any data. ONLY WHEN ALL

###UNLOCKING PHASE
**shrinking phase**Trasaction releases all locks and cannot obtain any new lock

1. This will always guarantees serializibility but does not prevent deadlocks


`DEADLOCK can happen in this 2 phase Locking method`

###CONTROL TECHNIQUES

1. Deadlock prevention
2. Deadlock detection
3. Deadlock avoidance

If the transacitons happen really fast then deadlock avoidance may not be the best possible approach.

###Timestamping(Always increasing and is unique)

1. Assigns a global, unique time stamp to each transaction.
2. Produces an explicit order.



Two types of schemes can be applied

1. Wait/ Dies
2. Wound / Wait


`T1 (Older) and T2(Newer)`

WAIT OR DIE SCHEME

1. If the younger one is having the lock then the older has to wait for its turn.
2. If the older one is having the lock then the younger one dies **rollback** , T2 id then rescheduled using the same timestamp.


WOUND OR WAIT 

1. IF T2 is having the lock then T1 will preempts T2.
2. If T2 wants the lock then it has to wait.


##Pessimistic Locking

Make the changes in a private copy of the database.

###CONFLICTS WILL HAPPEN (RESTROOMS)


###Phases of Optimistic Approach

1. Read
2. Validate
3. Write




















































































