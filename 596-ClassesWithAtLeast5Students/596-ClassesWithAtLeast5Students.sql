-- Last updated: 8/11/2026, 5:53:03 PM
# Write your MySQL query statement below
select Class
from Courses group by Class having count(student)>=5;
