# Write your MySQL query statement below
select C.name as 'Customers' from Customers as C LEFT JOIN Orders as O On C.id = O.customerId where o.customerId IS NULL;