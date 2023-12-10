SELECT c.id, c.name
FROM customers c
LEFT JOIN locations loc ON c.id = loc.id_customers
WHERE loc.id IS NULL
ORDER BY c.id;