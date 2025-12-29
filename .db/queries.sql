SELECT 
    b.name AS band_name,
    c.name AS country_name,
    b.formed_at,
    b.status,
    STRING_AGG(g.name, ' / ') AS genres
FROM band b
JOIN country c ON b.country_id = c.id
LEFT JOIN band_genre bg ON b.id = bg.band_id
LEFT JOIN genre g ON bg.genre_id = g.id
GROUP BY b.id, c.name;  