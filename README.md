
HiberNate-CRUD-OPERATIONS:
Hibernate CRUD Operations with Advanced Entity Mapping
This repository contains Java programs demonstrating basic CRUD (Create, Read, Update, Delete) operations using the Hibernate ORM (Object-Relational Mapping) framework. Additionally, it showcases complex entity relationships, including one-to-one, one-to-many, and many-to-many bidirectional mappings using Hibernate.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Features:
1.CRUD Operations: Basic CRUD operations (Create, Read, Update, Delete) on database tables using Hibernate.
2.One-to-One Bidirectional Mapping: Demonstrates a one-to-one relationship between Student and Student_detail entities, allowing bidirectional access and manipulation.
3.One-to-Many and Many-to-Many Mappings:
4.One-to-Many: Represents the relationship between Student and Course, where one student can be associated with multiple courses.
5.Many-to-Many: Illustrates the relationship between Course and Instructor, where multiple instructors can teach multiple courses.
6.Hibernate Annotations: Uses JPA annotations to define entity relationships and table mappings.
7.Session Management: Efficient session handling to interact with the database through Hibernate.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Technologies Used:
1.Java: Core programming language.
2.Hibernate ORM: For mapping Java classes to database tables.
3.MySQL (or your preferred database): As the relational database for storage.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Project Structure:
1.Student Entity: Represents a student in the database and includes a one-to-one relationship with Student_detail and a one-to-many relationship with Course.
2.Student_detail Entity: Represents additional details about a student, such as branch and hobby.
3.Course Entity: Represents a course, with many-to-one relationships with Student and many-to-many relationships with Instructor.
4.Instructor Entity: Represents an instructor, who can teach multiple courses, represented through a many-to-many relationship.
5.Hibernate Configuration: Configured in hibernate.cfg.xml for database connection settings and entity mappings.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CRUD Operations:
The project supports the following CRUD operations:

1.Create: Add new entries to the database.
2.Read: Retrieve and display entries.
3.Update: Modify existing entries.
4.Delete: Remove entries from the database.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Advanced Entity Mappings:

1.One-to-One Bidirectional Mapping:
The one-to-one bidirectional mapping between Student and Student_detail entities is configured using the @OneToOne annotation.
@JoinColumn specifies the foreign key column in the Student entity, allowing navigation from both Student and Student_detail.

2.One-to-Many Relationship:
A one-to-many relationship is defined between Student and Course entities, where a student can enroll in multiple courses.
Mapped with @OneToMany and @ManyToOne annotations, allowing a list of courses to be stored within each student record.

3.Many-to-Many Relationship:
Course and Instructor entities are associated in a many-to-many relationship.
The @ManyToMany annotation and a @JoinTable configuration allow multiple instructors to teach multiple courses.
