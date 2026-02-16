-- DAY 19 EXCERCISE 

-- CREATING EMP5 TABLE FOR EXCERCISE
CREATE TABLE EMP5( EMP_ID NUMBER(10), EMP_NAME VARCHAR2(100), EMP_SALARY NUMBER(10) ); 

-- Question 1: Write a PL/SQL procedure named add_employee that inserts a new employee into the employees table. 

CREATE OR REPLACE PROCEDURE ADD_EMPLOYEE (EID IN NUMBER,ENAME IN VARCHAR2,ESAL IN NUMBER)
IS BEGIN
INSERT INTO EMP5 VALUES(EID,ENAME,ESAL);
END;
/

-- EXECUTION OF THIS PROCEDURE

BEGIN ADD_EMPLOYEE(122,'MAHESH',15000);
DBMS_OUTPUT.PUT_LINE('ROW INSERTED CHECK IT WITH SELECT QUERY ');
END;
/

-- Question 2: Write a PL/SQL procedure named update_salary that updates the salary of an employee in the employees table. The procedure should take the following input parameters: 
-- p_id (Employee ID)
-- p_new_salary (New Salary)

-- PROCEDURE FOR ABOVE

CREATE PROCEDURE UPDATE_SALARY (EID IN NUMBER,SAL IN NUMBER)
IS BEGIN
UPDATE EMP5 SET EMP_SALARY=SAL WHERE EMP_ID=EID;
END;
/

-- EXECUTION
DECLARE
SAL NUMBER;
BEGIN 
SAL:=&SAL;
UPDATE_SALARY(121,SAL);
-- SELECT EMP_SALARY INTO SAL FROM EMP5;
DBMS_OUTPUT.PUT_LINE('UPDATED SALARY: ');
END;
/

-- Question 3: Create a PL/SQL procedure named get_employee_info that retrieves the name and salary of an employee based on their ID. The procedure should take the following input parameter:
-- p_id (Employee ID)
-- The procedure should output the following:
-- emp_name (Employee Name)
-- emp_salary (Employee Salary)

-- PROCEDURE FOR ABOVE

CREATE PROCEDURE GET_EMPLOYEE (EID IN NUMBER,ENAME OUT VARCHAR2,ESAL OUT NUMBER)
IS
BEGIN
SELECT EMP_NAME,EMP_SALARY INTO ENAME,ESAL FROM EMP5 WHERE EMP_ID=EID;
END;
/

-- EXECUTION
DECLARE
ENAME EMP5.EMP_NAME%TYPE;
ESAL EMP5.EMP_SALARY%TYPE;
BEGIN
GET_EMPLOYEE(121,ENAME,ESAL);
DBMS_OUTPUT.PUT_LINE('PROCEDURE EXECUTED'||CHR(10)||'HERE ARE OUTPUT ROWS'||CHR(10)||'NAME: '||ENAME||CHR(10)||'SALARY: '||ESAL);
END;
/
-- Question 4:Write a PL/SQL procedure named delete_employee that deletes an employee from the employees table based on their ID. The procedure should take the following input parameter:
-- •	p_id (Employee ID)


-- DELETING ONE RECORD USING PROCEDURE
CREATE PROCEDURE "DEL_EMP" (ID IN NUMBER)
IS BEGIN
DELETE EMP5 WHERE EMP_ID=ID;
END;
/

-- EXECUTING DELETING PROCEDURE
DECLARE
IDD NUMBER;
BEGIN
IDD:=&IDD;
DEL_EMP(IDD);
DBMS_OUTPUT.PUT_LINE('ROW DELETED CHECK IT!!');
END;
/

-- DEMO PROCEDURE
CREATE OR REPLACE PROCEDURE EMP_NAME(EID IN NUMBER,ENAME OUT VARCHAR2)
IS
BEGIN
SELECT EMP_NAME INTO ENAME FROM EMP5 WHERE EMP_ID=EID;
END;
/

-- CALLING

DECLARE
EID NUMBER:=121;
ENAME EMP5.EMP_NAME%TYPE;
BEGIN
EMP_NAME(EID,ENAME);
DBMS_OUTPUT.PUT_LINE('EMPLOYEE: '||ENAME);
END;
/


