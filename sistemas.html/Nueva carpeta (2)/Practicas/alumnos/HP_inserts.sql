-- ============================================================
--  Datos de ejemplo: Harry Potter
-- ============================================================

USE Multimedia;

-- ------------------------------------------------------------
-- 1. Entretenimiento
-- ------------------------------------------------------------
INSERT INTO Entretenimiento (TituloEspecifico, Titulo, Creador, TipoEntretenimiento) VALUES
('La piedra filosofal',   'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('La cámara secreta',     'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('El prisionero de Azkaban', 'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('El cáliz de fuego',     'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('La Orden del Fénix',    'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('El misterio del príncipe', 'Harry Potter', 'J.K. Rowling', 'Libro/Película'),
('Las reliquias de la Muerte', 'Harry Potter', 'J.K. Rowling', 'Libro/Película');


-- ------------------------------------------------------------
-- 2. Personaje  (todos aparecen desde la primera entrega)
-- ------------------------------------------------------------
INSERT INTO Personaje (Nombre, Titulo, ID_Entretenimiento) VALUES
('Harry Potter',       'El Elegido',              1),
('Ron Weasley',        'El Mejor Amigo',           1),
('Hermione Granger',   'La Mejor Bruja de su Año', 1),
('Albus Dumbledore',   'Director de Hogwarts',     1),
('Severus Snape',      'Profesor de Pociones',     1);


-- ------------------------------------------------------------
-- 3. InfoPersonaje  (1:1 con Personaje)
--    Vive_Muere: 1 = vive al final, 0 = muere
-- ------------------------------------------------------------
INSERT INTO InfoPersonaje (ID_Personaje, Vive_Muere, Nacimiento, Altura) VALUES
(1, 1, '1980-07-31', 1.73),   -- Harry Potter
(2, 1, '1980-03-01', 1.80),   -- Ron Weasley
(3, 1, '1979-09-19', 1.65),   -- Hermione Granger
(4, 0, '1881-07-27', 1.85),   -- Dumbledore (muere)
(5, 0, '1960-01-09', 1.82);   -- Snape (muere)


-- ------------------------------------------------------------
-- 4. Conexion  (relaciones entre personajes)
-- ------------------------------------------------------------
INSERT INTO Conexion (TipoRelacion, TITULO, Escenas_conjuntas, Parejas) VALUES
('Amistad',    'El trío dorado',             'Múltiples en todos los libros', NULL),
('Rivalidad',  'Harry vs Snape',             'Clases de Pociones',            NULL),
('Mentoria',   'Dumbledore y Harry',         'Lecciones privadas',            NULL),
('Rivalidad',  'Hermione y Snape',           'Clases de Pociones',            NULL),
('Amistad',    'Ron y Hermione',             'Múltiples en todos los libros', 'Sí');


-- ------------------------------------------------------------
-- 5. Personaje_Conexion  (N:M)
--    Conexion 1 (trío dorado): Harry, Ron, Hermione
--    Conexion 2 (Harry vs Snape): Harry, Snape
--    Conexion 3 (Dumbledore y Harry): Dumbledore, Harry
--    Conexion 4 (Hermione y Snape): Hermione, Snape
--    Conexion 5 (Ron y Hermione): Ron, Hermione
-- ------------------------------------------------------------
INSERT INTO Personaje_Conexion (ID_Personaje, ID_Conexion) VALUES
(1, 1),  -- Harry      → trío dorado
(2, 1),  -- Ron        → trío dorado
(3, 1),  -- Hermione   → trío dorado
(1, 2),  -- Harry      → Harry vs Snape
(5, 2),  -- Snape      → Harry vs Snape
(4, 3),  -- Dumbledore → Dumbledore y Harry
(1, 3),  -- Harry      → Dumbledore y Harry
(3, 4),  -- Hermione   → Hermione y Snape
(5, 4),  -- Snape      → Hermione y Snape
(2, 5),  -- Ron        → Ron y Hermione
(3, 5);  -- Hermione   → Ron y Hermione


-- ------------------------------------------------------------
-- 6. Momentos  (escenas concretas por conexión)
-- ------------------------------------------------------------
INSERT INTO Momentos (Dialogo, Elementos, ID_Conexion) VALUES
('Siempre seremos los tres.', 'Varita, capa invisible, mapa del merodeador', 1),
('No hay diferencia entre nosotros.', 'Aula de pociones, caldero', 2),
('Eres muy parecido a tu padre.', 'Despacho del director, Fénix Fawkes', 3),
('La señorita Granger... siempre levanta la mano.', 'Clase de pociones', 4),
('¿De verdad no lo ves, Ron?', 'Sala común de Gryffindor', 5);


-- ------------------------------------------------------------
--  VERIFICACIÓN RÁPIDA
-- ------------------------------------------------------------
SELECT 'Entretenimiento' AS Tabla, COUNT(*) AS Registros FROM Entretenimiento
UNION ALL
SELECT 'Personaje',         COUNT(*) FROM Personaje
UNION ALL
SELECT 'InfoPersonaje',     COUNT(*) FROM InfoPersonaje
UNION ALL
SELECT 'Conexion',          COUNT(*) FROM Conexion
UNION ALL
SELECT 'Personaje_Conexion',COUNT(*) FROM Personaje_Conexion
UNION ALL
SELECT 'Momentos',          COUNT(*) FROM Momentos;
