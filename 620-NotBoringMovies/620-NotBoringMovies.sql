-- Last updated: 8/11/2026, 5:52:49 PM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;