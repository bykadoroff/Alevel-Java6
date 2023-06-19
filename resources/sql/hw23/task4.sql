SELECT *
FROM customer
WHERE firstName LIKE 'A%';


SELECT *
FROM customer
WHERE country = 'Ukraine';


SELECT *
FROM customer
WHERE sex = 'male';


UPDATE customer
SET country = 'USA'
WHERE dateOfBirth < '2000-01-01';


DELETE
FROM Customer
WHERE country = 'Russia';


SELECT
DISTINCT firstName
FROM Customer;


SELECT *
FROM Customer
ORDER BY dateOfBirth DESC;