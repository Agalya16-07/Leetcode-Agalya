-- Last updated: 8/11/2026, 5:53:00 PM
# Write your MySQL query statement below
select 
    name
from salesperson 
where sales_id not in (select o.sales_id
                      from orders o join company c
                      on o.com_id = c.com_id
                      where c.name = 'RED'
); 

