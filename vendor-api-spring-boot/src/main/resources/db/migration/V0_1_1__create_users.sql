CREATE TABLE USERS (
  ID SERIAL,
  name varchar(255) not null,
  phone_number varchar(255) not null,
  type varchar(255) not null,
  created_at timestamp not null,
  updated_at timestamp not null,
  CONSTRAINT pk_users_id PRIMARY KEY (ID)
);