INSERT INTO BRAND (name) VALUES('Akkodis Brand premium')
INSERT INTO BRAND (name) VALUES('Akkodis Brand normal')
INSERT INTO BRAND (name) VALUES('Akkodis Brand low-cost')


INSERT INTO PRODUCT VALUES(1,35455,'Akkodis Product premium A')
INSERT INTO PRODUCT VALUES(1,35456,'Akkodis Product premium B')

INSERT INTO PRODUCT VALUES(2,35457,'Akkodis Product normal A')
INSERT INTO PRODUCT VALUES(3,35458,'Akkodis Product low-cost B')


INSERT INTO PRICE (cost, end_Date, priority, product_id, start_Date, current) VALUES(35.50,'2020-12-31 23.59.59',0,35455,'2020-06-14 00.00.00','EUR')
INSERT INTO PRICE (cost, end_Date, priority, product_id, start_Date, current) VALUES(25.45,'2020-06-14 18.30.00',1,35455,'2020-06-14 15.00.00','EUR')
INSERT INTO PRICE (cost, end_Date, priority, product_id, start_Date, current) VALUES(30.50,'2020-06-15 11.00.00',1,35455,'2020-06-15 00.00.00','EUR')
INSERT INTO PRICE (cost, end_Date, priority, product_id, start_Date, current) VALUES(38.95,'2020-12-31 23.59.59',1,35455,'2020-06-15 16.00.00','EUR')