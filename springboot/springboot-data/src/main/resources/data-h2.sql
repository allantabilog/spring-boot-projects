drop table customers if exists;
create table customers(id serial, first_name varchar(255), last_name varchar(255));
insert into customers (first_name, last_name) values ('Pepe', 'Templer');


