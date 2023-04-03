Create Table Contas(
    id int not null AUTO_INCREMENT primary key,
    dataconta date not null,
    idCliente int not null,
    valorconta DECIMAL not null
);