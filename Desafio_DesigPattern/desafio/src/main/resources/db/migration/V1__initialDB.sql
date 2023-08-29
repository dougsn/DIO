CREATE TABLE endereco (
    cep VARCHAR(100) PRIMARY KEY NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    complemento VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    localidade VARCHAR(100) NOT NULL,
    uf VARCHAR(100) NOT NULL,
    ibge VARCHAR(100) NOT NULL,
    gia VARCHAR(100) NOT NULL,
    ddd VARCHAR(100) NOT NULL,
    siafi VARCHAR(100) NOT NULL
);

CREATE TABLE cliente (
     id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
     nome VARCHAR(30) NOT NULL,
     fk_id_endereco VARCHAR(100) NOT NULL,
     FOREIGN KEY(fk_id_endereco)
        REFERENCES endereco(cep)
);