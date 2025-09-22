# Write your MySQL query statement below
SELECT employee_id,salary "bonus"
FROM employees
WHERE employee_id%2=1 AND name NOT LIKE 'M%'

UNION 

SELECT employee_id,0 "bonus"
FROM employees
WHERE employee_id%2=0 OR name LIKE 'M%'

ORDER BY employee_id;