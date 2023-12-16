-- creo tabla
CREATE TABLE alumnos (
  id INTEGER PRIMARY KEY,
  nombre varchar(40) NOT NULL,
  apellido varchar(40) NOT NULL,
  edad tinyint(2) NOT NULL,
  fecha timestamp NOT NULL,
  provincia varchar(30) NOT NULL
)
CHARACTER SET latin1 COLLATE latin1_swedish_ci;
-- inserto valores
INSERT INTO alumnos VALUES (1, 'Ryan', 'Smith', '20', TIMESTAMP(), 'Buenos Aires');
INSERT INTO alumnos VALUES (2, 'Pepe', 'Belle', '45', TIMESTAMP(), 'Chaco');
INSERT INTO alumnos VALUES (3, 'Pocoyo', 'Azul', '10', TIMESTAMP(), 'Neuquen');
INSERT INTO alumnos VALUES (4, 'Pato', 'Amarillo', '11', TIMESTAMP(), 'Río Negro');
INSERT INTO alumnos VALUES (5, 'Dibu', 'Martinez', '32', TIMESTAMP(), 'Buenos Aires');