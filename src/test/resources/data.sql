DROP TABLE PRODUCTS IF EXISTS;

CREATE TABLE IF NOT EXISTS PRODUCTS (
  barcode INT NOT NULL,
  productName VARCHAR(100) NOT NULL,
  description TEXT(2000)  NOT NULL,
  colour VARCHAR(100) NOT NULL,
  dimentions VARCHAR(100) NOT NULL,
  materials VARCHAR(200) NOT NULL,
  stock INT NOT NULL

);


INSERT INTO PRODUCTS (barcode, productName, description, colour, dimentions, materials, stock) VALUES (23456781, 'Welcome Sloth Complete Skateboard', 'The Sloth complete comes fitted with Welcome branded trucks and wheels with Abec 7 bearings so they not only look great but perform like a charm. Featuring eccentric and weirdly wonderful artwork, and original deck shapes unique to Welcome skateboards', 'Purple', '8\"', '7-Ply North American Maple', 69);
INSERT INTO PRODUCTS (barcode, productName, description, colour, dimentions, materials, stock) VALUES (18273645, 'UrbanArtt x Striker Custom Stunt Scooter', 'Featuring a range of high quality components from UrbanArtt, Striker, District, Blazer Pro and Eagle Sport brands', 'Chrome/Black/Blue', '950x118', 'Aluminium', 420);
INSERT INTO PRODUCTS (barcode, productName, description, colour, dimentions, materials, stock) VALUES (81726354, 'Almost Places R7 Skateboard Deck - Youness', 'Oh the places youll go, with this R7 Pro Places Series deck from Almost.', 'Orange', '8', '7-Ply Canadian Maple', 808);

