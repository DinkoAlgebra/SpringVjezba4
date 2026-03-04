DROP TABLE IF EXISTS hardware;

create table hardware (
                          id int primary key IDENTITY,
                          code varchar(100) not null unique,
                          name varchar(100) not null,
                          type varchar(100) not null,
                          stock int not null,
                          price decimal(10,2) not null
);

insert into hardware (code, name, type, stock, price)
values
    ( '1234561', 'Asus TUF RTX 3080', 'GPU', 0, 1599.00),
    ( '1234562', 'EVGA XC3 RTX 3070 Ti', 'GPU', 0, 1299.00),
    ( '1234563', 'AMD Ryzen 5950X', 'CPU', 0, 899.00),
    ( '1234564', 'Samsung 980 PRO SSD 1TB', 'STORAGE', 0, 299.00),
    ( '1234565', 'Kingston FURY Beast DDR5 32GB', 'RAM', 0, 699.00);

SELECT * FROM hardware;