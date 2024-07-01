create table currency_exchange(
id integer primary key,
currency_from varchar(100),
currency_to varchar(100),
conversion_multiple integer,
environment varchar(200)
);