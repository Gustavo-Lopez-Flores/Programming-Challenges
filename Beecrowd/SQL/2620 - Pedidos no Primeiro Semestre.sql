SELECT customers.name, orders.id
FROM customers
JOIN orders ON (customers.id = orders.id_customers) 
WHERE EXTRACT(MONTH FROM orders.orders_date) <= 6 
AND EXTRACT(YEAR FROM orders.orders_date) = 2016;