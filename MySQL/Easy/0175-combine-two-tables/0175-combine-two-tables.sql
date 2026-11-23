# Write your MySQL query statement below
select firstName, lastName, city, state from 
 Person as P left JOIN Address as A ON
    P.personId = A.personId;
