DROP TABLE IF EXISTS products CASCADE;

create table products (
	barcode integer generated by default as identity,
	productName varchar(50) Not null,
	description varchar(500),
	colour varchar(20),
	dimentions varchar(50),
	materials varchar(50),
	stock integer,
	primary key (barcode)
    );

