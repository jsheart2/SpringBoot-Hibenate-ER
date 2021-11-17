Java SpringBoot

yang kita butuhkan yaitu:

PostgreSQL
Postman
Skema Pembuatan Database

CREATE TABLE order 
( 
	Order_id serial, 
	customer_name character varying(128) NOT NULL,
	order_date date NOT NULL, 
	total_order numeric(15, 2) NOT NULL, 
	PRIMARY KEY (Order_id) 
);

CREATE TABLE product 
( 
	Kode_Barang character varying(12), 
	NamaProduk character varying(128) NOT NULL, 
	Unit character varying(16) NOT NULL, 
	Harga numeric(12, 2) NOT NULL, 
	PRIMARY KEY (kode_barang) 
);

CREATE TABLE order_item 
( 
	order_item_id serial, 
	order_qty integer NOT NULL, 
	unit_price character varying(12) NOT NULL, 
	order_id real NOT NULL, 
	Product numeric(12, 2) NOT NULL, 
	PRIMARY KEY (OrderItemId), 
	CONSTRAINT OrderQty_fkey FOREIGN KEY (OrderQty) 
	REFERENCES order (Order_id), 
	CONSTRAINT KodeBarang_fkey FOREIGN KEY (Kode_Barang) 
	REFERENCES NamaProduk (Kode_Barang) 
);

INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('12112334', 'Oreo', 'pcs', 5000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('22615172', 'Susu Segar', 'liter', 25000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('33217645', 'Roti Tawar', 'pcs', 15000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('44615217', 'Kapas', 'pcs', 12000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('55671621', 'Pasta Gigi', 'pcs', 9000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('77881623', 'Oroe', 'pcs', 6000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('99181213', 'Susu Segar', 'Liter', 18000.00); 
INSERT INTO product (Kode_Barang, NamaProduk, Unit, Harga) VALUES ('10102934', 'Roti Tawar', 'pcs', 15000.00);
