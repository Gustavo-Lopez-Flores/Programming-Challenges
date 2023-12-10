SELECT products.name, providers.name, products.price
FROM products
JOIN providers ON (providers.id = products.id_providers) 
JOIN categories ON (categories.id = products.id_categories) 
WHERE categories.name = 'Super Luxury' AND products.price > 1000;