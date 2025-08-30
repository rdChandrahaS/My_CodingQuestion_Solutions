/* Write your PL/SQL query statement below */
SELECT email "Email"
FROM person
HAVING COUNT(email)>1
GROUP BY email;
