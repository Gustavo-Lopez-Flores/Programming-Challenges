SELECT lr.name AS richard_name, ROUND(lr.omega * 1.618, 3) AS n_factor
FROM life_registry lr
JOIN dimensions d ON lr.dimensions_id = d.id
WHERE d.name IN ('C875', 'C774') and lr.name LIKE 'Richard%'
ORDER BY lr.omega;