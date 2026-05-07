-- INSERTAR MARCAS
INSERT INTO marca (id_marca, nombre, pais)
VALUES (1, 'Honda', 'Japón');

INSERT INTO marca (id_marca, nombre, pais)
VALUES (2, 'Toyota', 'Japón');

INSERT INTO marca (id_marca, nombre, pais)
VALUES (3, 'Nissan', 'Japón');

-- INSERTAR AUTOS
INSERT INTO auto (no_serie, tipo, modelo, precio, marca_id)
VALUES ('AAA111', 'Civic', 2022, 250000, 1);

INSERT INTO auto (no_serie, tipo, modelo, precio, marca_id)
VALUES ('BBB222', 'Corolla', 2023, 270000, 2);

INSERT INTO auto (no_serie, tipo, modelo, precio, marca_id)
VALUES ('CCC333', 'Sentra', 2021, 220000, 3);