use orquestas;

CREATE TABLE concerts (
id INT NOT NULL AUTO_INCREMENT,
city VARCHAR(64) NOT NULL,
country VARCHAR(32) NOT NULL,
year INT,
rating DECIMAL(10,2),
orchestra_id INT NOT NULL,
PRIMARY KEY (id),
CONSTRAINT fk_concerts_orchestra
FOREIGN KEY (orchestra_id)
REFERENCES orchestras(id)
ON UPDATE CASCADE
ON DELETE RESTRICT
) ENGINE=InnoDB;

-- =========================
-- INSERTS EN concerts
-- =========================
INSERT INTO concerts (id, city, country, year, rating, orchestra_id) VALUES
(1, 'Madrid', 'España', 2022, 8.5, 1),
(2, 'Barcelona', 'España', 2023, 9.0, 2),
(3, 'Lisboa', 'Portugal', 2021, 7.9, 3),
(4, 'Sevilla', 'España', 2024, 8.1, 4),
(5, 'Valencia', 'España', 2022, 8.8, 5),
(6, 'París', 'Francia', 2023, 9.3, 1),
(7, 'Berlín', 'Alemania', 2024, 9.5, 2),
(8, 'Roma', 'Italia', 2021, 7.6, 3),
(9, 'Viena', 'Austria', 2023, 9.7,4),
(10, 'Granada', 'España', 2022, 8.2, 5),
(11, 'Madrid', 'España', 2024, 8.9, 1),
(12, 'Lisboa', 'Portugal', 2023, 8.4, 1),
(13, 'París', 'Francia', 2022, 9.1, 2),
(14, 'Valencia', 'España', 2024, 8.6, 3),
(15, 'Berlín', 'Alemania', 2023, 9.4, 3),
(16, 'Roma', 'Italia', 2022, 7.8, 4),
(17, 'Sevilla', 'España', 2023, 8.0, 5),
(18, 'Budapest', 'Hungría', 2024, 7.7, 4),
(19, 'Barcelona', 'España', 2022, 9.2, 4),
(20, 'Viena', 'Austria', 2024, 9.6, 1);