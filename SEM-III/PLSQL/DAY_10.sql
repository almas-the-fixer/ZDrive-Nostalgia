-- DAY 10
-- 1.	Create a PL/SQL block that determines the shipping method based on the weight of a package. If the weight is less than 5 pounds, use 'Standard Shipping'. For weights between 5 and 20 pounds, use 'Priority Shipping'. Any weight above 20 pounds should be shipped 'Express'. Test your code with a package weighing 18 pounds.

DECLARE
WEIGHT NUMBER(5);
BEGIN
WEIGHT:=&WEIGHT;
IF WEIGHT < 5 THEN
DBMS_OUTPUT.PUT_LINE('STANDARD SHIPPING!');
ELSIF WEIGHT > 4 AND WEIGHT < 21 THEN
DBMS_OUTPUT.PUT_LINE('PRIORITY SHIPPING!!');
ELSE
DBMS_OUTPUT.PUT_LINE('EXPRESS');
END IF;
END;
/
-- 2.	Write a PL/SQL block that determines the tax to be paid based on a person's annual income. If the income is less than or equal to 50000, the tax rate is 10%. For incomes between 50001 and 100000, the tax rate is 20%. Any income above 100000 is taxed at 30%. Test your code with an income of 75000.

DECLARE
INCOME NUMBER(10);
TAX FLOAT;
BEGIN
INCOME:=&INCOME;
IF INCOME <= 50000 THEN
TAX := INCOME * 0.1;
DBMS_OUTPUT.PUT_LINE('INCOME :'||INCOME||' TAX: '||TAX);
ELSIF INCOME >= 50001 AND INCOME < 100000 THEN
TAX := INCOME * 0.2;
DBMS_OUTPUT.PUT_LINE('INCOME :'||INCOME||' TAX: '||TAX);
ELSE
TAX := INCOME * 0.3;
DBMS_OUTPUT.PUT_LINE('INCOME :'||INCOME||' TAX: '||TAX);
END IF;
END;
/

-- 3.	Create a PL/SQL block that updates the salary of an employee using a %ROWTYPE variable. Declare a variable of type employees%ROWTYPE, fetch the details of an employee with employee_id 101, and increase the salary by 10%.
-- DEMO TABLE EMP3 FOR QUESTION
CREATE TABLE EMP3(EID NUMBER(3),ENAME VARCHAR2(30),SALARY NUMBER(10));

-- INSERTING 5 RECORDS
INSERT INTO EMP3 VALUES(101,'ALMAS',50000);
INSERT INTO EMP3 VALUES(102,'HARSH',40000);
INSERT INTO EMP3 VALUES(103,'NIHAR',45000);
INSERT INTO EMP3 VALUES(104,'KRISH',30000);
INSERT INTO EMP3 VALUES(105,'BURHAN',35000);

-- SQL BLOCK
DECLARE
ID EMP3.EID%TYPE;
E1 EMP3%ROWTYPE;
BEGIN
ID:=&ID;
DBMS_OUTPUT.PUT_LINE('OLD RECORDS:');
SELECT * INTO E1 FROM EMP3 WHERE EID=ID;
DBMS_OUTPUT.PUT_LINE('OLD SALARY: '||E1.SALARY);
UPDATE EMP3 SET SALARY=SALARY+SALARY*0.1 WHERE EID=ID;
SELECT * INTO E1 FROM EMP3 WHERE EID=ID;
DBMS_OUTPUT.PUT_LINE('NEW SALARY: '||E1.SALARY);
END;
/

-- -- 4.	Create a PL/SQL block to calculate the total discount for a customer based on their total purchase amount. Use a CASE statement with the following ranges:
-- $100 - $499: 5% discount
-- $500 - $999: 10% discount
-- $1000 - $1999: 15% discount
-- $2000 and above: 20% discount

DECLARE
AMT NUMBER(10);
DISCOUNT FLOAT;
BEGIN
AMT:=&AMT;
CASE
WHEN AMT BETWEEN 100 AND 499 THEN
DISCOUNT := AMT * 0.05;
DBMS_OUTPUT.PUT_LINE('DISCOUNT ON PRICE: '||DISCOUNT);
WHEN AMT BETWEEN 500 AND 1000 THEN
DISCOUNT := AMT * 0.1;
DBMS_OUTPUT.PUT_LINE('DISCOUNT ON PRICE: '||DISCOUNT);
WHEN AMT BETWEEN 1000 AND 2000 THEN
DISCOUNT := AMT * 0.15;
DBMS_OUTPUT.PUT_LINE('DISCOUNT ON PRICE: '||DISCOUNT);
ELSE
DISCOUNT := AMT * 0.2;
DBMS_OUTPUT.PUT_LINE('DISCOUNT ON PRICE: '||DISCOUNT);
END CASE;
END;
/