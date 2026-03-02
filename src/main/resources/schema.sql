create table if not exists hardware (
    id identity,
    code varchar(100) not null unique,
    name varchar(100) not null,
    type varchar(100) not null,
    stock int not null,
    price numeric not null
    );