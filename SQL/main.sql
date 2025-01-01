
CREATE TABLE tbl_departments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) UNIQUE
);

CREATE TABLE tbl_employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT CHECK (age >= 18),
    salary DECIMAL(10, 2),
    department_id INT,
    status VARCHAR(10) DEFAULT 'Active',
    FOREIGN KEY (department_id) REFERENCES tbl_departments(id)
);

CREATE TABLE tbl_customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(50)
);

CREATE TABLE tbl_products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE tbl_orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    FOREIGN KEY (customer_id) REFERENCES tbl_customers(id),
    FOREIGN KEY (product_id) REFERENCES tbl_products(id)
);

-- Insert Sample Data into Parent Tables
-- Insert into tbl_departments
INSERT INTO tbl_departments (name) VALUES 
('HR'), 
('Finance'), 
('IT'), 
('Marketing');

-- Insert into tbl_customers
INSERT INTO tbl_customers (name, city) VALUES 
('Harshey', 'Mumbai'), 
('Riya', 'Gujrat'), 
('Karan', 'Delhi');

-- Insert into tbl_products
INSERT INTO tbl_products (name) VALUES 
('Laptop'), 
('Smartphone'), 
('Tablet');

-- Insert Sample Data into Child Table
INSERT INTO tbl_employees (name, age, salary, department_id) VALUES 
('Sakshi', 30, 50000, 1), 
('Arjun', 25, 60000, 2), 
('Aryan', 35, 70000, 3), 
('Kavya', 28, 55000, 4);

INSERT INTO tbl_orders (customer_id, product_id) VALUES 
(1, 1), -- John Doe ordered a Laptop
(2, 2), -- Jane Smith ordered a Smartphone
(3, 3); -- Robert Brown ordered a Tablet

-- Basic Queries
-- Select
SELECT * FROM tbl_employees;

-- Distinct
SELECT DISTINCT city FROM tbl_customers;

-- Where
SELECT * FROM tbl_employees WHERE age > 30;

-- And & Or
SELECT * FROM tbl_employees WHERE age > 30 AND salary > 50000;
SELECT * FROM tbl_employees WHERE age < 25 OR salary > 70000;

-- Order By
SELECT * FROM tbl_employees ORDER BY salary DESC;

-- Insert Into
INSERT INTO tbl_employees (name, age, salary, department_id) VALUES ('Eve', 29, 65000, 1);

-- Update
UPDATE tbl_employees SET salary = 70000 WHERE name = 'Eve';

-- Delete
DELETE FROM tbl_employees WHERE name = 'Eve';

-- Select Top (LIMIT in MySQL)
SELECT * FROM tbl_employees ORDER BY salary DESC LIMIT 3;

-- Like and Wildcards
SELECT * FROM tbl_employees WHERE name LIKE 'A%';

-- In
SELECT * FROM tbl_employees WHERE department_id IN (1, 2);

-- Between
SELECT * FROM tbl_employees WHERE salary BETWEEN 50000 AND 70000;

-- Aliases
SELECT name AS EmployeeName, salary AS EmployeeSalary FROM tbl_employees;

-- Joins
-- Inner Join
SELECT tbl_employees.name, tbl_departments.name AS Department
FROM tbl_employees
INNER JOIN tbl_departments ON tbl_employees.department_id = tbl_departments.id;

-- Left Join
SELECT tbl_employees.name, tbl_departments.name AS Department
FROM tbl_employees
LEFT JOIN tbl_departments ON tbl_employees.department_id = tbl_departments.id;

-- Right Join
SELECT tbl_employees.name, tbl_departments.name AS Department
FROM tbl_employees
RIGHT JOIN tbl_departments ON tbl_employees.department_id = tbl_departments.id;

-- Full Join (emulated with UNION)
SELECT tbl_employees.name, tbl_departments.name AS Department
FROM tbl_employees
LEFT JOIN tbl_departments ON tbl_employees.department_id = tbl_departments.id
UNION
SELECT tbl_employees.name, tbl_departments.name AS Department
FROM tbl_employees
RIGHT JOIN tbl_departments ON tbl_employees.department_id = tbl_departments.id;

-- Union
SELECT name FROM tbl_employees
UNION
SELECT name FROM tbl_customers;

-- Select Into
CREATE TABLE tbl_backup_employees AS SELECT * FROM tbl_employees;

-- Insert Into Select
INSERT INTO tbl_employees (name, age, salary, department_id)
SELECT name, age, salary, department_id FROM tbl_backup_employees;

-- Create Table with Constraints
CREATE TABLE tbl_contractors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

-- Not Null
ALTER TABLE tbl_employees MODIFY COLUMN name VARCHAR(50) NOT NULL;

-- Primary Key, Foreign Key
-- Already included in table creation



-- Drop Table
DROP TABLE tbl_contractors;

-- Alter Table
ALTER TABLE tbl_employees ADD email VARCHAR(100);

-- Views
CREATE VIEW active_employees AS
SELECT name, age FROM tbl_employees WHERE status = 'Active';

-- Null Values
SELECT * FROM tbl_employees WHERE department_id IS NULL;

-- Group By
SELECT department_id, COUNT(*) AS EmployeeCount FROM tbl_employees GROUP BY department_id;

-- Having
SELECT department_id, AVG(salary) AS AvgSalary
FROM tbl_employees
GROUP BY department_id
HAVING AVG(salary) > 55000;

-- Functions
SELECT COUNT(*) AS EmployeeCount FROM tbl_employees;


