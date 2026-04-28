use orquestas;

CREATE TABLE members (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(64) NOT NULL,
position VARCHAR(32),
experience INT,
orchestra_id INT NOT NULL,
wage INT,
PRIMARY KEY (id),
CONSTRAINT fk_members_orchestra
FOREIGN KEY (orchestra_id)
REFERENCES orchestras(id)
ON UPDATE CASCADE
ON DELETE RESTRICT
) ENGINE=InnoDB;

-- =========================
-- INSERTS EN members
-- =========================
INSERT INTO members (id, name, position, experience, orchestra_id, wage) VALUES
(1, 'Ana Torres', 'Violinista', 12, 1, 32000),
(2, 'Luis Martínez', 'Cellista', 8, 2, 28000),
(3, 'Marta Silva', 'Flautista', 10, 3, 29500),
(4, 'Carlos Ruiz', 'Percusionista', 6, 4, 24000),
(5, 'Elena Gómez', 'Pianista', 15, 5, 41000),
(6, 'Javier Moreno', 'Trompetista', 9, 2, 30000),
(7, 'Sofía Navarro', 'Clarinetista', 11, 3, 33500),
(8, 'Pedro Castro', 'Contrabajista', 7, 3, 26000),
(9, 'Lucía Herrera', 'Violinista', 14, 5, 39000),
(10, 'Diego Romero', 'Director asistente', 18, 1, 52000),
(11, 'Raúl Medina', 'Oboísta', 9, 1, 27500),
(12, 'Carmen Ortega', 'Violonchelista', 13, 2, 34800),
(13, 'Andrés Vega', 'Trombonista', 7, 3, 26200),
(14, 'Patricia León', 'Arpista', 16, 4, 43000),
(15, 'Fernando Gil', 'Violinista', 5, 5, 23500),
(16, 'Natalia Cruz', 'Fagotista', 11, 2, 31900),
(17, 'Sergio Peña', 'Percusionista', 8, 3, 28700),
(18, 'Irene Soto', 'Clarinetista', 14, 4, 36500),
(19, 'Alberto Núñez', 'Trompetista', 10, 1, 30500),
(20, 'Beatriz Marín', 'Pianista', 12, 1, 39200);