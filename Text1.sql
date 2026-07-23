 DROP DATABASE college_db;
Query OK, 1 row affected (0.06 sec)

mysql> CREATE DATABASE college_db;
Query OK, 1 row affected (0.01 sec)

mysql> USE college_db;
Database changed
mysql>
mysql> CREATE TABLE STUDENT (
    ->     StudentID INT PRIMARY KEY,
    ->     Name VARCHAR(50),
    ->     Age INT,
    ->     Gender VARCHAR(10),
    ->     Department VARCHAR(10),
    ->     Semester INT,
    ->     City VARCHAR(50),
    ->     Marks INT
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql>
mysql> INSERT INTO STUDENT
    -> (StudentID, Name, Age, Gender, Department, Semester, City, Marks)
    -> VALUES
    -> (101, 'Rahul', 20, 'Male', 'CSE', 4, 'Hyderabad', 85),
    -> (102, 'Priya', 21, 'Female', 'ECE', 5, 'Chennai', 90),
    -> (103, 'Adit', 19, 'Male', 'CSE', 3, 'Bengaluru', 78),
    -> (104, 'Sneha', 20, 'Female', 'EEE', 4, 'Hyderabad', 88),
    -> (105, 'Arjun', 22, 'Male', 'IT', 6, 'Pune', 92),
    -> (106, 'Kavya', 21, 'Female', 'CSE', 5, 'Vijayawada', 81),
    -> (107, 'Rohit', 20, 'Male', 'ECE', 4, 'Delhi', 75),
    -> (108, 'Neha', 19, 'Female', 'IT', 3, 'Mumbai', 89),
    -> (109, 'Kiran', 22, 'Male', 'ECE', 6, 'Hyderabad', 84),
    -> (110, 'Anjali', 20, 'Female', 'EEE', 4, 'Chennai', 95);
Query OK, 10 rows affected (0.01 sec)
Records: 10  Duplicates: 0  Warnings: 0

mysql>
mysql> SELECT * FROM STUDENT;
+-----------+--------+------+--------+------------+----------+------------+-------+
| StudentID | Name   | Age  | Gender | Department | Semester | City       | Marks |
+-----------+--------+------+--------+------------+----------+------------+-------+
|       101 | Rahul  |   20 | Male   | CSE        |        4 | Hyderabad  |    85 |
|       102 | Priya  |   21 | Female | ECE        |        5 | Chennai    |    90 |
|       103 | Adit   |   19 | Male   | CSE        |        3 | Bengaluru  |    78 |
|       104 | Sneha  |   20 | Female | EEE        |        4 | Hyderabad  |    88 |
|       105 | Arjun  |   22 | Male   | IT         |        6 | Pune       |    92 |
|       106 | Kavya  |   21 | Female | CSE        |        5 | Vijayawada |    81 |
|       107 | Rohit  |   20 | Male   | ECE        |        4 | Delhi      |    75 |
|       108 | Neha   |   19 | Female | IT         |        3 | Mumbai     |    89 |
|       109 | Kiran  |   22 | Male   | ECE        |        6 | Hyderabad  |    84 |
|       110 | Anjali |   20 | Female | EEE        |        4 | Chennai    |    95 |
+-----------+--------+------+--------+------------+----------+------------+-------+
10 rows in set (0.01 sec)