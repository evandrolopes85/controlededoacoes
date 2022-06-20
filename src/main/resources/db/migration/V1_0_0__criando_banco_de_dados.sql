create table tbl_pessoa(
  id_pessoa     int NOT NULL AUTO_INCREMENT,
  nome          varchar(64) NOT NULL,
  email         varchar(100) NOT NULL,
  telefone      varchar(16) NOT NULL,
  senha         varchar(16) NOT NULL,
  administrador int NOT NULL,
  cep           varchar(9) NOT NULL,
  logradouro    varchar(64) NOT NULL,
  numero        varchar(8) NOT NULL,
  complemento   varchar(16) NOT NULL,
  bairro        varchar(32) NOT NULL,
  cidade        varchar(32) NOT NULL,
  uf            varchar(2) NOT NULL,
  CONSTRAINT pk_pessoa PRIMARY KEY (`id_pessoa`)
);

create table tbl_evento(
  id_evento    int NOT NULL AUTO_INCREMENT,
  nome         varchar(64) NOT NULL,
  data_inicio  date DEFAULT NULL,
  data_fim     date DEFAULT NULL,
  data_criacao date DEFAULT NULL,
  url_foto     varchar(255) NOT NULL,
  ativo        int NOT NULL,
  descricao    text,
  id_pessoa    int NOT NULL,
  CONSTRAINT pk_evento PRIMARY KEY (`id_evento`),
  CONSTRAINT fk_pessoa_evento FOREIGN KEY (`id_pessoa`) REFERENCES tbl_pessoa (`id_pessoa`)
);

create table tbl_item(
  id_item int NOT NULL AUTO_INCREMENT,
  produto varchar(100) NOT NULL,
  CONSTRAINT pk_item PRIMARY KEY (`id_item`)
); 

create table tbl_contem(
  id_contem int NOT NULL AUTO_INCREMENT,
  id_evento int NOT NULL,
  id_item   int NOT NULL,
  qtd_necessaria int NOT NULL,
  qtd_obtida     int NOT NULL,
  CONSTRAINT pk_contem PRIMARY KEY(id_contem),
  CONSTRAINT fk_contem_evento FOREIGN KEY (id_evento) REFERENCES tbl_evento (id_evento),
  CONSTRAINT fk_contem_item FOREIGN KEY (id_item) REFERENCES tbl_item (id_item) 
);

insert into tbl_pessoa values (null, 'Evandro', 'evandrcwd@gmail.com', '11912345678','1234',1, '08000000', 'rua de casa', '0', 'A', 'bairro', 'cidade', 'uf');