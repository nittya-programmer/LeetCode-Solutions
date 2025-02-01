# Write your MySQL query statement below
update Salary
    set sex=if(sex='m','f','m');
#here we use CASE(WHEN,THEN,ELSE) and IF 