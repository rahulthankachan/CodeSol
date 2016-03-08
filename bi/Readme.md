 ##Business Intelligence

####Chapter 13

RollUp
Cube

1. Comprehensive set of tools and **processes**.`Capture and then collect`.
2. Generate and presenting information which finally helps in Decision Making.


###Business Intelligence Framework

1. Governance - Master data, rules


####Data

1. Operational Data: Every single transaction.
2. External Data: It is any information that the company may find it useful. eg Competition Sales


###ETL - Extraction, transformation and loading

Extractiion is only about taking what is required
Transformation could also include something, like change of currency
Loading is creation of tables in the warehouse

Sometimes the smaller chunk of the warehouse is **Data Mart**

**KPI -Key Performance Indicators** - Alerts can be set on the data.


###Pactices to Manage Data

**MDM - Master Data Management** Same standards

**Governance** Maintaing the standards, people

**KPI**


###Business Intelligence Benefits
1. Improved decision making.
2. **Integrates the architecture**. All the countries follow the same standard
3. Common User Interfaces for data reporting.
4. Common data repository fosters single version of company data.
5. Improved organizational performance.


Decision Support Data:
Differs from the operational Data in ;

1. Time Span
2. Granularity - The stress is more on the queries
`Drill Down` and `Roll Up`
3. **Dimesionality**, Product type dimension, Time dimesion, Locantion dimension.



###DIFFERENCES
Data currency TIME is Real time| Historic

Granularity Atomic and detailed data| Summarized data

Summarization Low\ High

Data Model Hihly Normalized: Non normalized

Type -  Mostly updates: Mostly queries

Volumes - High: Periodic

Speed: Critical: Retrievals are critical

Data Volumen : Hundresds of gigs : terabytes Petabytes


###Characteristics of Data Warehouse Data

1. Integrated
2. Subject - Oriented
3. Time- Variant Data is varied over perioid of time
4. NonVolatile - Data cannot be changed


###Extraction, transformation and laoding

The ETL Process


###Data- Mart

Small, single-subject data warehouse subset.


###STAR SCHEMA
Facts and dimensions represented by physical tables in Data warehouse database

`The primary key of the fact table will always be a composite key`

1. Data Modelling technique
2. Fact table is in the middle of the dimensions
3. This fact is then broken down into many different dimensions
4. This could be **Time**, **Product**, **Location**


###Snpw Flake Schema


###Data Analytics

`Exaplanatory Analytics`
Focuses on discovering and explaining data characteristics and relationships based on existing daa

`Predictive Analysis`


###Online Analytical Processing
Advanced data analysis environment that supports **desicion making, business modelling and operations research**

Characteristics

1. Multidimensional data analysis
2. Advanced database support
3. Easy interface

New Ideas

1. **ROLAP** Relational online Analytical Provides OLAP functionality using Relational databases.
2. Extensions added to the traditional RDBMS technology



2
. **molap**


###MOLAP

1. Much larger
2. Extends OLAP functionality to multidimensional database management systems.
3. visualize the stored data as data CUBE
4. Grow to **n** dimensions and beome hypercubes.



Differences

**SCHEMA**

Uses the Star schema **|||** Uses the data cubes

**Database Size**

Medium to Large **|||** Large

**Access**

Allows adhoc requests, unlimited dim **|||** Limited dimension, Proprietory access languages

**SPEED**

Good for small **|||** Large



###Commands

###GROUP BY ROLLUP

###GROUP BY CUBE()



###Materialistic View
Converts


````````

CREATE MATERIALIZED VIEW view_name 
BUILD (IMMEDIATE | DEFERRED)
REFRESH (FAST| COMPLETE| FORCE) ON COMMIT
ENABLE QUERY REWRTIE
AS SELECT_ QUERY 







````````































