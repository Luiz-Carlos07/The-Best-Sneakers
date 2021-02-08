CREATE DATABASE loja_virtual;

USE loja_virtual;

CREATE TABLE cliente(
    Nome varchar(100) NOT NULL,
    CPF varchar(100) NOT NULL,
    Idade int NOT NULL,
    Sexo varchar(100) NOT NULL,
    Email varchar(100) NOT NULL,
    Telefone varchar(50) NOT NULL,
    PRIMARY KEY(CPF)
);


CREATE TABLE endereco_cliente(
	UF varchar(100) NOT NULL,
    CEP varchar(100) NOT NULL,
    Bairro varchar(100) NOT NULL,
    Rua varchar(100) NOT NULL,
    Numero varchar(100) NOT NULL,
    N_apartamento int,
    PRIMARY KEY(CEP,Bairro,Rua,Numero)
);
    
CREATE TABLE funcionario(
    Nome varchar(100) NOT NULL,
    Matricula varchar(100) NOT NULL,
    Cargo varchar(100) NOT NULL,
    CPF varchar(100) NOT NULL,
    Idade int NOT NULL,
    Sexo varchar(100) NOT NULL,
    Email varchar(100) NOT NULL,
    Telefone varchar(50) NOT NULL,
    PRIMARY KEY(CPF, Matricula)
);

CREATE TABLE tenis(
	Nome varchar(100) NOT NULL,
    Cor varchar(100) NOT NULL,
    Tamanho int NOT NULL,
    Fabricante varchar(100) NOT NULL,
    Categoria varchar(100) NOT NULL,
	Cod_barras int NOT NULL,
    Quant_estoque int NOT NULL,
    PRIMARY KEY(Cod_barras)	
);

select * from cliente;

describe cliente;

#drop database loja_virtual;
#drop table cliente;