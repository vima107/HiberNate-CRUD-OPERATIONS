# HiberNate-CRUD-OPERATIONS

Hibernate CRUD Operations with One-to-One Bidirectional Mapping
This repository contains Java programs demonstrating basic CRUD (Create, Read, Update, Delete) operations using Hibernate ORM (Object-Relational Mapping) framework. 
Additionally, it includes examples of one-to-one bidirectional mapping using Hibernate, showcasing how entities in a relational database can be associated with each other.

------------------------------------------------------------------------------------------------------------------------------------------

Features:
1.CRUD Operations: Basic CRUD operations (Create, Read, Update, Delete) on database tables using Hibernate.
2.One-to-One Bidirectional Mapping: Demonstrates one-to-one relationships between entities where each entity can reference the other, allowing bidirectional access and manipulation.
3.Hibernate Annotations: Uses JPA annotations to define entity relationships and table mappings.
4.Session Management: Efficient session handling to interact with the database through Hibernate.

------------------------------------------------------------------------------------------------------------------------------------------

Technologies Used:
1.Java: Core programming language.
2.Hibernate ORM: For mapping Java classes to database tables.
3.MySQL (or your preferred database): As the relational database for storage.

------------------------------------------------------------------------------------------------------------------------------------------

Project Structure
1.Student Entity: Represents a student in the database. Contains a one-to-one relationship with the Student_detail entity.
2.Student_detail Entity: Represents additional details about a student, such as branch and hobby.
3.Hibernate Configuration: Configured in hibernate.cfg.xml for database connection settings and entity mappings.

------------------------------------------------------------------------------------------------------------------------------------------

CRUD Operations
The project supports the following CRUD operations:

1.Create: Add new entries to the database.
2.Read: Retrieve and display entries.
3.Update: Modify existing entries.
4.Delete: Remove entries from the database.
5.One-to-One Bidirectional Mapping Example

The one-to-one bidirectional mapping between Student and Student_detail is set up using Hibernate annotations:

@OneToOne: Maps the one-to-one relationship between the entities.
@JoinColumn: Specifies the foreign key column in the Student entity.
Bidirectional Access: Both Student and Student_detail entities reference each other, allowing navigation from either entity.

------------------------------------------------------------------------------------------------------------------------------------------