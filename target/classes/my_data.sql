-- Insertando algunos registros para que la base de datos no este vacia

INSERT INTO CLIENTES (ID_CLIENTE,NOMBRE,TEL,PAIS) VALUES (1,'Antonio Hernández','918546721','España');
INSERT INTO CLIENTES (ID_CLIENTE,NOMBRE,TEL,PAIS) VALUES (2,'Pedro Perez','916546721','Mexico');
INSERT INTO CLIENTES (ID_CLIENTE,NOMBRE,TEL,PAIS) VALUES (3,'Lujian Parejo','918546321','Chile');

INSERT INTO CONSUMO (ID_CONSUMO,ID_CLIENTE,ELECTRODOMESTICO,HORAS_USO,HORA_CONSUMO) VALUES (1,1,'Lavadora',2,20:00:00);
INSERT INTO CONSUMO (ID_CONSUMO,ID_CLIENTE,ELECTRODOMESTICO,HORAS_USO,HORA_CONSUMO) VALUES (2,1,'Secadora',2,22:00:00);
INSERT INTO CONSUMO (ID_CONSUMO,ID_CLIENTE,ELECTRODOMESTICO,HORAS_USO,HORA_CONSUMO) VALUES (3,2,'Lavavajillas',1,07:00:00);

INSERT INTO PRECIOS(HORA_CONSUMO,PRECIO_LUZ_HORA) VALUES (20:00:00, 0.5);
INSERT INTO PRECIOS(HORA_CONSUMO,PRECIO_LUZ_HORA) VALUES (22:00:00, 0.7);