-- Last updated: 8/11/2026, 5:50:36 PM
# Write your MySQL query statement below
select player_id,min(event_date) as first_login
from Activity
group by player_id
