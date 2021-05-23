CREATE DATABASE homologacao;

USE homologacao;

CREATE TABLE produto (id int auto_increment primary key, 
                      nome varchar(80) not null,
                      descricao varchar(120),
                      preco decimal(10,2));

CREATE TABLE cliente (id int auto_increment primary key, 
                      nome varchar(80) not null,
                      cpf varchar(14) not null,
                      numero_telefone varchar(14)
                      data_nascimento date,
                      estado_civil varchar(20),
                      endereco varchar(90) not null,
                      cep varchar(9) not null,
                      cidade varchar(80) not null,
                      uf varchar(2));

CREATE TABLE venda (id int auto_increment primary key,
                    data_venda date not null,
                    id_cliente int not null,
                    valor_total decimal(10,2) not null,
                    foreign key(id_cliente) references cliente(id));

CREATE TABLE item_venda (id int auto_increment primary key,
                         id_venda int not null,
                         id_produto int not null,
                         qtd int not null,
                         valor_unitario decimal(10,2) not null,
                         foreign key(id_venda) references venda(id),
                         foreign key(id_produto) references produto(id));