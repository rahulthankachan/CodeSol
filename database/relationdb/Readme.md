##Relational DB Model

###Determination: 

It is a state such that knowing the value of one attribute we can identify the value of other.

**Functional Dependence**
Value of one or more attributes determines the value of other attributes.

**Determinant** : Atrribute who value determines the other
**Dependent** : Attribute whose value is determined

**Full functional Dependence**: 

Entire collection of the attribute in the determinant is necessary for the relationship.


###Entity Integrity

1. Every row in a table has a unique identity
2. All value sin the PK shuld be unique
3. Cannot be NULL


###Referential Integrity

1. Every reference to another entity should be valid


###KEYS

* primary (foreign) keys are a subset of candidate keys are a subset of superkeys

* simple keys vs compound keys vs composite keys

* surrogate keys (just make up brand new unique keys)

* secondary, or 'alternate' keys


###Closure:

Use of the relational algebra operators on existing relations produces **new relations**.

Realational set operators

1. Select
2. Project
3. Union
4. Intersect
5. Difference 
6. Product
7. Division
8. Join


###Natural Join

Links 2 tables by selecting those rows wwhich have the common values for the common attributes.

###Data Redundancy

1. Data redundancy may be increased to make the database serve **crucial information puposes**
2. Increased to preserve the **historical accuracy of the data**








