SELECT products.name, categories.name 
FROM products JOIN categories 
ON (products.id_categories = categories.id)
WHERE products.amount > 100 AND (categories.id = 1 OR categories.id = 2 OR
categories.id = 3 OR categories.id = 6 OR categories.id = 9)
ORDER BY (categories.id);