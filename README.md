# Hibernate Skill 3 – HQL Operations

## Overview

This project demonstrates the use of Hibernate Query Language (HQL) to perform advanced data retrieval operations on a Product entity. It covers sorting, pagination, filtering, grouping, and aggregate functions using Hibernate ORM.

## Technologies Used

* Java
* Hibernate ORM
* MySQL
* IntelliJ IDEA
* Git and GitHub

## Project Description

The application extends a Hibernate-based setup to execute structured queries using HQL. It enables efficient and database-independent interaction with the underlying relational database.

## Features Implemented

### Sorting

* Retrieve products sorted by price in ascending order
* Retrieve products sorted by price in descending order
* Retrieve products sorted by quantity in descending order

### Pagination

* Display the first three products
* Display the next three products using offset

### Aggregate Functions

* Count total number of products
* Count number of products with quantity greater than zero
* Count products grouped by description
* Find minimum and maximum product price

### Filtering

* Retrieve products within a specified price range using WHERE clause

### Pattern Matching

* Retrieve product names starting with specific characters
* Retrieve product names ending with specific characters
* Retrieve product names containing a substring
* Retrieve product names with a fixed character length

### Grouping

* Group products based on description using GROUP BY

## Project Structure

* Product.java – Entity class representing the product table
* HibernateUtil.java – Utility class for session factory configuration (if used)
* Main.java – Contains HQL query implementations
* hibernate.cfg.xml – Hibernate configuration file

## How to Run

1. Clone the repository:
   git clone https://github.com/divishamishra533code/Git-hub-lab-3.git

2. Open the project in IntelliJ IDEA

3. Configure database connection in hibernate.cfg.xml

4. Build and run the main class

## Output

The application prints query results in the console, including sorted records, paginated data, and aggregate results. The database can be verified using MySQL Workbench.

## Conclusion

This project demonstrates how HQL simplifies complex SQL operations and enables efficient data retrieval in Hibernate-based applications and is done for academic purposes.

## Author

Divisha Mishra
