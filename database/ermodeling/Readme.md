## ER Modeling

###Composite :
Composite attributes can be divided into subparts. For example, an attribute name
could be structured as a composite attribute consisting of first-name, middle-initial,
and last-name.

###Multivalued:
There may be instances where an attribute has a set of values for a specific
entity. Consider an employee entity set with the attribute phone-number. An
employee may have zero, one, or several phone numbers, and different employees


####Advantages of derived types

1. Can store the distorical data
2. Data is readily available

Dis
Constant maintenance

####Existence Dependence

Entity exists in database only when it is associated with another entity occurance

####Existence Independence

1. Entity Exists apart from all the related entities.
2. Referred to as the strong entity.

`Eg. if A is EMPLOYEE and B is DEPENDENT, a dependent (eg. child) in B can only exist if there is a corresponding employee (eg. Dad) in A`. ***THIS DOES NOT MAKE 'B' A WEAK ENTITY!***




###Relationship

**Weak Relationship;**

Primary key of the related does not contain the PK of the parent entity.

**Strong Relationship**
PK of the related contains the PK


Weak Entity:

1. WILL BE Existentially Dependent
2. `REMOVING THE main entity will produce duplicates in the weak eantity table`
3. Example: Employee and Dependent.

###Relationship degree
Number of entities or participants associated with a relationship.

1. Unary
2. Binary
3. Ternary


###PARTICIPATION

**MINE: IF THIS EXOST THEN CAN THE OTHER BE STILL NULL**

**10 THE ONE SIDE IS OPTIONAL**

###Bridge entity is Always a weak entity


###Developing an ER Diagram

1. Identify the business rules
2. Main Entities and relationships
3. Develop the initial ERD
4. PK, Attributes
5. Revise and review






