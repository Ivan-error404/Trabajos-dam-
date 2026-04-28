create database orquestas;
use orquestas;

CREATE TABLE orchestras (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(32) NOT NULL,
rating DECIMAL(10,2),
city_origin VARCHAR(32),
country_origin VARCHAR(32),
year INT,
PRIMARY KEY (id)
) ENGINE=InnoDB;

show tables;

-- =========================
-- INSERTS EN orchestras
-- =========================
INSERT INTO orchestras (id, name, rating, city_origin, country_origin, year) VALUES
(1, 'Orquesta Sinfónica de Madrid', 8.7, 'Madrid', 'España', 1995),
(2, 'Filarmónica de Barcelona', 9.1, 'Barcelona', 'España', 1988),
(3, 'Orquesta Nacional de Lisboa', 8.3, 'Lisboa', 'Portugal', 1979),
(4, 'Sinfónica de Sevilla', 7.8, 'Sevilla', 'España', 2001),
(5, 'Filarmónica de Valencia', 8.9, 'Valencia', 'España', 1992);
