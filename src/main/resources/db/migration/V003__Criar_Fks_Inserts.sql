ALTER TABLE Contas add CONSTRAINT FK_Contas_Cliente foreign key(id_cliente) references cliente(id);

insert into Cliente(nomecliente) values ('Matheus');
insert into Cliente(nomecliente) values ('Pedro');
insert into Cliente(nomecliente) values ('Vinicius');
insert into Cliente(nomecliente) values ('Raul');
insert into Cliente(nomecliente) values ('Gabriel');
insert into Cliente(nomecliente) values ('Nara');
insert into Cliente(nomecliente) values ('Barbara');


insert into Contas(dataconta, id_cliente, valorconta) values ('2005-05-21', 1, 21.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2003-01-21', 2, 22.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2004-02-21', 3, 24.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2006-03-21', 4, 25.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2007-04-21', 5, 27.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2008-08-21', 6, 26.2);
insert into Contas(dataconta, id_cliente, valorconta) values ('2009-09-21', 7, 29.2);
