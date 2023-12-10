SELECT name, cast(EXTRACT(DAY FROM payday) as int) AS day
FROM loan;