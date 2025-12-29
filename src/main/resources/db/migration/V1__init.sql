CREATE TABLE country (
    id UUID PRIMARY KEY,
    name VARCHAR(255)
);

INSERT INTO country VALUES
(gen_random_uuid(), 'Chile');

CREATE TABLE genre (
    id UUID PRIMARY KEY,
    name VARCHAR(255)
);

INSERT INTO genre VALUES
(gen_random_uuid(), 'Death'), 
(gen_random_uuid(), 'Black'),
(gen_random_uuid(), 'Thrash'),
(gen_random_uuid(), 'Power'),
(gen_random_uuid(), 'Progressive'),
(gen_random_uuid(), 'Doom'),
(gen_random_uuid(), 'Groove'),
(gen_random_uuid(), 'Blackened');

CREATE TABLE band (
    id UUID PRIMARY KEY,
    name VARCHAR(255),
    country_id UUID,
    formed_at DATE NOT NULL,
    status BOOLEAN,
    CONSTRAINT fk_country
        FOREIGN KEY(country_id)
        REFERENCES country(id)
);

INSERT INTO band VALUES
(gen_random_uuid(), 'Criminal', (SELECT id FROM country WHERE name = 'Chile'), 
'1991-01-01', TRUE);

CREATE TABLE band_genre (
    band_id UUID,
    genre_id UUID,
    PRIMARY KEY (band_id, genre_id),
    CONSTRAINT fk_band
        FOREIGN KEY(band_id)
        REFERENCES band(id),
    CONSTRAINT fk_genre
        FOREIGN KEY(genre_id)
        REFERENCES genre(id)
);

INSERT INTO band_genre VALUES
(
    (SELECT id FROM band WHERE name = 'Criminal'),
    (SELECT id FROM genre WHERE name = 'Death')
),
(
    (SELECT id FROM band WHERE name = 'Criminal'),
    (SELECT id FROM genre WHERE name = 'Thrash')
);  