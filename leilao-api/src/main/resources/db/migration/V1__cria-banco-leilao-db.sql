/*CREATE DATABASE "leilao-db"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False; */

CREATE SEQUENCE seq_unidade increment 1 minvalue 1 maxvalue 9999999 START 1 cache 1;
CREATE TABLE unidade(
	id integer PRIMARY KEY,
	nome varchar(128),
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL
);

CREATE SEQUENCE seq_empresa increment 1 minvalue 1 maxvalue 9999999 START 1 cache 1;
CREATE TABLE empresa(
	id integer PRIMARY KEY,
	razao_social varchar(64) NOT NULL,
	cnpj varchar(32) UNIQUE NOT NULL,
	logradouro varchar(64),
	municipio varchar(64),
	numero varchar(10),
	complemento varchar(64),
	bairro varchar(64),
	cep varchar(16),
	telefone varchar(32),
	email varchar(254) NOT NULL,
	site varchar(128),
	usuario varchar(20) UNIQUE NOT NULL,
	senha varchar(128),
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL
);

CREATE SEQUENCE seq_leilao increment 1 minvalue 1 maxvalue 9999999 START 1 cache 1;
CREATE TABLE leilao(
	id integer PRIMARY KEY,
	codigo integer,
	descricao varchar(60) NOT NULL,
	vendedor integer NOT NULL,
	inicio_previsto timestamp NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL
);

CREATE TABLE comprador(
	empresa integer,
	leilao integer,
	CONSTRAINT empresa_comp_fk FOREIGN KEY(empresa) REFERENCES empresa,
	CONSTRAINT leilao_comp_fk FOREIGN KEY(leilao) REFERENCES leilao,
	CONSTRAINT comprador_pk PRIMARY KEY(empresa, leilao)
);

CREATE SEQUENCE seq_lote increment 1 minvalue 1 maxvalue 9999999 START 1 cache 1;
CREATE TABLE lote(
	id integer PRIMARY KEY,
	numero_lote integer,
	descricao varchar(60) NOT NULL,
	quantidade numeric NOT NULL,
	valor_inicial numeric,
	unidade varchar(128) NOT NULL,
	leilao integer NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	CONSTRAINT leilao_lote_fk FOREIGN KEY(leilao) REFERENCES leilao
);
