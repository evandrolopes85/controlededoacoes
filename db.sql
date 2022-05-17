create database rdb;

use rdb;

create table tbl_pessoa | CREATE TABLE `tbl_pessoa` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(64) NOT NULL,
  `email` varchar(32) NOT NULL,
  `telefone` varchar(16) NOT NULL,
  `senha` varchar(16) NOT NULL,
  `administrador` tinyint(1) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `logradouro` varchar(64) NOT NULL,
  `numero` varchar(8) NOT NULL,
  `complemento` varchar(16) DEFAULT NULL,
  `bairro` varchar(32) DEFAULT NULL,
  `cidade` varchar(32) NOT NULL,
  `uf` char(2) NOT NULL,
  PRIMARY KEY (`id`)
);

create table tbl_evento | CREATE TABLE `tbl_evento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(64) NOT NULL,
  `data_inicio` date DEFAULT NULL,
  `data_fim` date DEFAULT NULL,
  `data_criacao` date DEFAULT NULL,
  `url_foto` varchar(255) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `descricao` text,
  `id_nome` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pessoa_evento` (`id_nome`),
  CONSTRAINT `fk_pessoa_evento` FOREIGN KEY (`id_nome`) REFERENCES `tbl_pessoa` (`id`)
);

create table tbl_evento_item | CREATE TABLE `tbl_evento_item` (
  `id_evento_item` int NOT NULL AUTO_INCREMENT,
  `produto` varchar(100) NOT NULL,
  `qtd_necessaria` int NOT NULL,
  `qtd_obtida` int NOT NULL,
  `id_evento` int DEFAULT NULL,
  PRIMARY KEY (`id_evento_item`),
  KEY `fk_evento_item` (`id_evento`),
  CONSTRAINT `fk_evento_item` FOREIGN KEY (`id_evento`) REFERENCES `tbl_evento` (`id`)
); 