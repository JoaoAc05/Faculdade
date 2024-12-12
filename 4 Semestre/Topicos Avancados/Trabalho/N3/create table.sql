CREATE DATABASE Gerenciamento;

USE Gerenciamento;

CREATE TABLE Fornecedores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    contato VARCHAR(100)
);

CREATE TABLE Categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE Produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10 , 2 ) NOT NULL,
    id_fornec INT,
    categoria_id INT,
    FOREIGN KEY (id_fornec)
        REFERENCES Fornecedores (id)
        ON DELETE SET NULL,
    FOREIGN KEY (categoria_id)
        REFERENCES Categorias (id)
        ON DELETE SET NULL
);