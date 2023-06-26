ALTER TABLE Contas add CONSTRAINT FK_Contas_Cliente foreign key(id_cliente) references cliente(id);

insert into Cliente(nomeCliente) values ('Matheus');
insert into Contas(dataconta, id_cliente, valorconta) values ('2005-05-21', 1, 21.2);