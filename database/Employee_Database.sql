create database Employee_Data;
use Employee_Data;
CREATE TABLE Employee (
   employee_Id INT NOT NULL,
   employee_Name VARCHAR(50) NOT NULL,
   date_Of_Birth DATE NOT NULL,
   PRIMARY KEY (employee_Id)
);
INSERT INTO `Employee` (employee_Id,employee_Name,date_Of_Birth) VALUES
						(1, 'Rohan Pethe','1998-05-10'),
                        (2,'Ankit Keshri','1997-06-06'),
                        (3, 'Shivam Raut','1997-01-25'),
                        (4, 'Shubham Raut','1998-02-09'),
                        (5, 'Vinay Gupta','1999-03-16'),
                        (6, 'Shreyash Nikhade','1999-04-24'),
                        (7, 'Utsav Dongre','2000-07-28'),
                        (8, 'Priyal Tembhare','2000-01-01'),
                        (9, 'Sarthak Chopkar','1998-01-27'),
                        (10, 'Shreyash Dhomne','1999-09-09'),
                        (11, 'Lucky Bisne','1995-11-17'),
                        (12, 'Vaibhav Urkude','1996-12-21'),
                        (13, 'Abhisek Kumar','2000-02-05'),
                        (14, 'Pratik Mukhade','1996-08-15'),
                        (15, 'Atharva Burade','1997-01-26');
select * from Employee;