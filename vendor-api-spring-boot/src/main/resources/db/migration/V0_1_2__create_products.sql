CREATE TABLE PRODUCTS (
  ID SERIAL,
  sku varchar(255) not null,
  name varchar(255) not null,
  price decimal not null,
  currency varchar(255) not null,
  vendor_id integer not null,
  created_at date not null,
  updated_at date not null
);