##Database 

###Data Modeling

####Data Model
Simple representations of complex real - world data structures.

####DATA Model consists of ---

**Entity** Unique and distinct object used to collect and store data.

**Attribute** It is the characterictic of the entity

**Relation** Association between the entities:

*  One to Many
*  Many to Many
*  One to one

**Constraints** For maintaining data integrity

Business Rules, Translating Business Rules into Data Models 

*  Noun is translated into an entity
*  Verb is translated into a relation
*  **TYPE OF RELATIONSHIP**
`How many of A are related to B?, Similarly, how many of B are related to A`


###Hirarchical

1. Manage large amounts of data for complex manufacturing projects
2. Represented with an upside tree with segments
3. Can should 1: M relationship

Advantages

1. Promotes data sharing
2. 1: M leads to data integrity and conceptual simplicity
3. Database security is enforced by the DBMS

Disadvantages

1. Navigational systems requires the knowledge of the hierarchical path
2. Changes in the structure require cahnges in all of the application programs
3. Lack of standards
4. No data definition


###Network

*  Represent complex data relationships
*  Improves database performance and a database standard
*  Depicts 1: M , m:M


Advantages

1. Conceptual simplicity
2. Handles more relationship types
3. Conformance to standards
4. Includes data definition language and data manipulation language
5. Data access is flexible
6. Owner/member relationship leads to integrity

Disadvantages

1. System complexity limits efficiency
2. Navigational system become very complex implementation
3. Structural changes


###Schema
It is the conceptual representation of the entire databse


###Relational model

Adv

1. Structural independence is promoted by using independent tables.
2. Tabular View improves conceptual implecity
3. Ad hoc query query capability by SQL
4. Isolates the user from the physical - level details
5. Improves the implementation and management simplicity


Dis

1. Poor SQL
2. Overhead on the underlying software and the hardware



###O - O Database

Allow to persist objects on the disc

1. cleaner - design, objects mimic the real world
2. inheritance and encapsulation
3. richer data types
4. good for CAD, multimedia





**Entity Relationship Model**

A good resource 
https://dl.dropboxusercontent.com/u/91263185/!shared/courses/CS585/s16/lectures/DataModeling/more/notations.pdf


Types of Models:

*  Conceptual Model ---- ER Diagram
*  Internal Model --- TABLES, software independent AND hardware independent (**Logical independence**- Changes in the internal model withput affecting the conceptual model)
*  Physical Model (Changes in the Pysical model do not affect the internal model is called the **Physical independence**)












