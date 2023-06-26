Create Table Contas(
    id int not null AUTO_INCREMENT primary key,
    dataconta date not null,
    valorconta DECIMAL(12,2) not null,
    id_cliente int not null
);